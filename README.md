# DagBok — Diary App

A simple diary ("dagbok") web app — create, edit, and soft-delete diary entries. Built as a
coursework project.

## Features

- Create, edit, and delete diary entries (soft delete — entries are flagged, not removed)
- List view showing only non-deleted entries
- Server-rendered HTML views (Thymeleaf)

## Tech stack

Java, Spring Boot, Spring Data JPA, MySQL, Thymeleaf.

## Getting started

**Prerequisites:** JDK 17+, MySQL running locally with a `dagbok_db` database.

Set your DB credentials as environment variables — never hardcode them in `application.properties`:

```bash
export DB_USERNAME=dagbok_db
export DB_PASSWORD=your_mysql_password
```

```bash
./mvnw spring-boot:run
```

## Project structure

```
src/main/java/com/dagboksapplikation/dagboksapplikation/
  DagBok.java              # entity — id, rubrik (title), text, datum (date), deleted flag
  DagBokRepositry.java     # CRUD repository + soft-delete query
  DagBokController.java    # views: list (non-deleted only), create, edit, soft-delete
```
