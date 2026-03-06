# cicd-example-java

A small public example repository for evaluator demos.

## What this repo contains

- A minimal Maven + JDK 21 Java project
- Passing unit tests for the success path
- Files that can be intentionally activated to demonstrate compile failure or test failure
- Example `.pipelines/` configs for:
  - success
  - test failure
  - compile failure
  - invalid YAML syntax
  - invalid dependency cycle

## Local verification

Requirements:

- JDK 21
- Maven 3.9+

Run the normal success path:

```bash
mvn -B clean test
```

This should succeed.

## Files used for failure demos

### Test-failure demo

This repo includes `src/test/java/com/example/CalculatorFailingTest.java`.
Your pipeline can copy or rename it into an active test file before running `mvn test`.

### Compile-failure demo

This repo includes `src/main/java/com/example/BrokenSource.java.template`.
Your pipeline can copy it to `BrokenSource.java` before running `mvn compile`.
The copied file contains a deliberate syntax error.

## Suggested evaluator flow

1. Run the success pipeline using `.pipelines/success.yaml`
2. Run the compile-failure pipeline using `.pipelines/fail-compile.yaml`
3. Run the test-failure pipeline using `.pipelines/fail-test.yaml`
4. Run config validation on `.pipelines/invalid-syntax.yaml`
5. Run config validation on `.pipelines/invalid-cycle.yaml`

## Important note

The YAML files under `.pipelines/` are intentionally generic because each course project may define a slightly different pipeline schema.
If your platform uses different top-level keys, rename the fields but keep the same shell commands and scenarios.
