# Job Listing Application

A simple **Full Stack Job Listing Application** built using **Spring Boot, MongoDB, Vue.js, and Axios**.
It allows users to **create, view, and search job postings** through REST APIs.

---

## 🚀 Features

* Add new job posts
* View all job listings
* Search jobs by keyword
* REST API backend
* MongoDB database integration

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Frontend:** HTML, Vue.js, Axios
* **Database:** MongoDB Atlas

---

## 📂 Project Structure

```
joblisting
│
├── controller
├── model
├── repository
├── resources
│   └── index.html
├── application.properties
└── pom.xml
```

---

## ▶️ Run the Application

1. Clone the repository

```
git clone https://github.com/yourusername/joblisting.git
```

2. Go to project folder

```
cd joblisting
```

3. Run the application

```
mvn spring-boot:run
```

---

## 🌐 Access

Open in browser:

```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint             | Description  |
| ------ | -------------------- | ------------ |
| GET    | /posts               | Get all jobs |
| POST   | /posts               | Add new job  |
| GET    | /posts/search/{text} | Search jobs  |

---

## 👨‍💻 Author

**Madhan Prem**

---

## 📄 License

For learning purposes.
