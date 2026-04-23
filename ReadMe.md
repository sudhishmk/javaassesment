# Java Backend Intern Assessment: Bookstore Modernization

## Overview
You are tasked with building a modern RESTful backend for a Bookstore using **Quarkus**. The project requires you to implement persistence, dependency injection, and error handling using the **Jakarta EE** (jakarta.*) standards.

## Technical Stack
- **Framework:** Quarkus
- **Java Version:** 17+
- **Persistence:** Hibernate Panache with H2 In-Memory Database
- **API:** Jakarta REST (JAX-RS)
- **Injection:** CDI (Contexts and Dependency Injection)

---

## Tasks & Mark Distribution (50 Total Marks)

### Task 1: Persistence Layer (15 Marks)
- **Goal:** Implement the data model.
- **Requirements:** - Create a `Book` entity in `src/main/java/org/assessment/entity/`.
  - Fields: `Long id`, `String title`, `String author`, `Double price`.
  - Use **PanacheEntity** or a Repository pattern.
  - **Mark Criteria:** Correct JPA annotations (5), Transactional integrity (5), H2 Configuration (5).

### Task 2: Business Logic with CDI (10 Marks)
- **Goal:** Implement a service for price calculations.
- **Requirements:** - Create a `DiscountService` annotated with `@ApplicationScoped`.
  - Implement a method `applyDiscount(Double price)` that returns the price after a 10% reduction.
  - **Mark Criteria:** Correct use of `@ApplicationScoped` (5), Logical correctness (5).

### Task 3: RESTful API Implementation (15 Marks)
- **Goal:** Expose the bookstore logic via HTTP.
- **Requirements:** - Create `BookResource` using `jakarta.ws.rs` annotations.
  - **POST `/books`**: Accept a JSON object to save a new book.
  - **GET `/books/{id}`**: Return book details including a calculated `discountedPrice`.
  - **Mark Criteria:** Endpoint mapping (5), CDI Injection of DiscountService (5), Proper JSON responses (5).

### Task 4: Graceful Error Handling (10 Marks)
- **Goal:** Manage edge cases.
- **Requirements:** - Implement a `BookNotFoundException` and an `ExceptionMapper`.
  - If a user searches for a non-existent ID, return a **404 Not Found** with a JSON body: `{"error": "Book not found"}`.
  - **Mark Criteria:** Mapper implementation (5), Correct HTTP Status code (5).

---

## Instructions
1. **Setup:** Run `./mvnw quarkus:dev` to start the development mode.
2. **Implementation:** Fill in the code in the provided scaffold. Look for `// TODO` comments.
3. **Testing:** You can test your endpoints using `curl` or Postman.
4. **Grading:** Run the command `bash grade.sh` in the terminal to see your preliminary score and feedback.

## Submission
Zip the entire project folder (excluding the `target/` directory) and submit as per the instructions provided by your coordinator.
