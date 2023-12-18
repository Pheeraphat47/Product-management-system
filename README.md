### Readme.md

# OnlineStore Application

This Java web application, developed for the INT202 Serverside Programming course, implements a simple online store system. It incorporates the concepts of Model-View-Controller (MVC), Java Persistence API (JPA), and Servlet Filtering.

## MVC (Model-View-Controller)

### Model

#### Product Entity Class

The `Product` class represents the entity mapped to the "products" table in the classicmodels database. It includes fields for product details such as product ID, name, price, and type.

#### Product Repository

The `ProductRepository` interface extends `JpaRepository` to enable basic CRUD operations for the `Product` entity.

### View

#### products.jsp

The JSP page `products.jsp` displays a list of products retrieved from the database. It uses JSTL to iterate through the product list and display details like name, price, and type.

### Controller

#### ProductController Servlet

The `ProductController` servlet handles requests related to product information. It interacts with the `ProductRepository` to fetch product data and forwards it to the `products.jsp` view for display.

## JPA (Java Persistence API)

### Entity Class

#### Order Entity Class

The `Order` class represents the entity mapped to the "orders" table in the classicmodels database. It includes fields for order details such as order ID, order date, and status.

#### EntityManager

An `EntityManager` is used to query the database for orders. Specifically, it includes a JPA Query to retrieve all orders with a status of 'Shipped'.

### Saving Order Data

Within the `ProductController` servlet, a function is added to handle order placement. Upon completing an order, the relevant order information is persisted in the "orders" table.

## Servlet Filtering

### AdminFilter

The `AdminFilter` intercepts requests to the `ProductController` servlet. If the request includes the 'admin' parameter, it performs additional actions (e.g., adding data to the page).

## Testing

Unit testing is conducted using JUnit or any preferred testing tool. Ensure proper functioning of the MVC, JPA, and Servlet Filtering components.

Feel free to explore the code and adapt it to your needs. Happy coding!
