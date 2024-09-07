# Swiggy Clone
#harsht
## Overview
This project is a clone of the popular food delivery platform **Swiggy**, built using **Spring MVC** for the backend, **JSP** for the frontend, and **SQL** for database management. It is deployed on an **Apache Tomcat** server.

## Features
- **Restaurant Listings:** Browse a variety of restaurants and view detailed menus.
- **Food Ordering:** Select dishes, customize orders, and add them to the cart.
- **Cart System:** Manage the cart by adding, removing, or updating items before checkout.
- **Order Tracking:** Real-time order status updates.
- **Responsive Design:** Works well across desktops and mobile devices.

## Tech Stack
- **Frontend:** JSP (Java Server Pages)
- **Backend:** Spring MVC
- **Database:** SQL (for user, restaurant, and order data)
- **Server:** Apache Tomcat

## Setup Instructions
### Prerequisites
- Install **Java**, **Apache Tomcat**, and a **SQL database** (e.g., MySQL).

### Backend (Spring MVC with JSP)
1. Clone the repository: `git clone https://github.com/your-username/Swiggy-Clone.git`
2. Import the project into your IDE (e.g., IntelliJ or Eclipse).
3. Configure the SQL database and update `application.properties` with your database connection details.
4. Build and deploy the project on Apache Tomcat.
5. Start the Tomcat server and access the application at `http://localhost:8080`.

### Database Setup
1. Set up your SQL database by running the SQL scripts found in the `db` folder to create the necessary tables (users, restaurants, orders, etc.).
2. Ensure your SQL server is up and running and connected to the application.

## License
This project is open-source and available under the [MIT License](LICENSE).
