# code-styles

---

The ```code-styles``` project defines the company code-styles applied in all repos. This project provides a standardized Checkstyle configuration for Java projects to ensure consistent code quality and formatting across all repositories.

## Features

- **Naming Conventions**: Enforces consistent naming for classes, methods, variables, constants, and packages
- **Code Formatting**: Enforces consistent code style including braces, whitespace, and indentation
- **Import Management**: Prevents star imports and detects unused/redundant imports
- **Code Quality**: Checks for cyclomatic complexity, proper array declarations, and other best practices
- **File Formatting**: Enforces Unix line endings and prohibits tab characters

## Code Style Rules

### Naming Conventions
- **Constants**: `UPPER_CASE_WITH_UNDERSCORES` (e.g., `MAX_SIZE`)
- **Classes/Interfaces**: `PascalCase` (e.g., `MyClass`)
- **Methods/Variables**: `camelCase` (e.g., `myMethod`, `myVariable`)
- **Packages**: `lowercase.with.dots` (e.g., `com.example.package`)

### Formatting Rules
- No tabs, only spaces for indentation
- Unix line endings (LF)
- Left curly braces on end of line
- Right curly braces on same line as `else`, `try`, and `catch`
- Braces required for all code blocks
- Whitespace around operators and keywords
- Maximum line length: 120 characters (warning only)

### Import Rules
- No star imports (explicit imports required)
- No unused imports
- No redundant/duplicate imports
- Avoid fully qualified class names (use imports instead)

### Code Quality
- Cyclomatic complexity limit: 7 (warning)
- Long constants must use uppercase 'L' (not lowercase 'l')
- Generic whitespace validation
- Array type style enforcement

### Note on Raw Types
Currently, the configuration does not include explicit detection for raw type usage (e.g., `List` instead of `List<String>`). Consider using compiler warnings (`-Xlint:rawtypes`) or additional static analysis tools for raw type detection.

# Build Status

---

[![pages-build-deployment](https://github.com/rslakra/code-styles/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/rslakra/code-styles/actions/workflows/pages/pages-build-deployment)


# How to set up

---

## 1. Clone the repository

```bash
git clone https://github.com/rslakra/code-styles.git
cd code-styles
```

## 2. Build the project

```bash
./buildMaven.sh
```

## 3. Run Checkstyle

Run Checkstyle validation with:

```bash
./checkStyles.sh
```

Or directly with Maven:

```bash
mvn checkstyle:checkstyle
```

# Integration into Other Projects

---

To use this code style configuration in your Maven project, add the following to your `pom.xml`:

```xml
<properties>
    <code-styles.dir>https://raw.githubusercontent.com/rslakra/code-styles/master</code-styles.dir>
    <checkstyle.threshold>0</checkstyle.threshold>
</properties>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
            <version>3.5.0</version>
            <executions>
                <execution>
                    <id>default</id>
                    <phase>process-classes</phase>
                    <goals>
                        <goal>check</goal>
                    </goals>
                    <configuration>
                        <configLocation>${code-styles.dir}/styles.xml</configLocation>
                        <propertiesLocation>${code-styles.dir}/checkstyle.properties</propertiesLocation>
                        <logViolationsToConsole>true</logViolationsToConsole>
                        <maxAllowedViolations>${checkstyle.threshold}</maxAllowedViolations>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

# Built With

---

* [Java](https://www.java.com/en/download/mac_download.jsp) - The Java Download Location
* [Maven](https://maven.apache.org/) - Dependency Management
* [Checkstyle](https://checkstyle.org/) - Static code analysis tool

# Reference

---

- [Code Styles Documentation](https://rslakra.github.io/code-styles/)
- [Checkstyle Documentation](https://checkstyle.org/)

# Author

---

* [**Rohtash Lakra**](https://github.com/rslakra)

