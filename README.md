# 📝 Advanced Todo List Application

A modern, responsive **Todo List Application** built with **Spring Boot, Thymeleaf, and Bootstrap 5**.  
This upgraded version provides a cleaner interface, advanced features, and an enhanced user experience for managing daily tasks efficiently.

---

## 🚀 Features

### ✅ Core Functionalities
- **Add new tasks** — Easily create new to-do items.
- **Edit tasks** — Update task titles directly.
- **Toggle completion** — Mark tasks as complete or incomplete.
- **Delete tasks** — Remove tasks with one click.

### 🔍 Advanced Additions
- **Search tasks** by name or keyword.
- **Sort tasks** by status or creation order.
- **Filter** to view *All*, *Completed*, or *Pending* tasks.
- **Responsive UI** using **Bootstrap 5** for both desktop and mobile devices.
- **Elegant design** with visual feedback (animations, colors, and icons).

---

## 🧩 Project Structure

```
todolistapp/
│
├── src/main/java/com/app/todolistapp/
│   ├── models/
│   │   └── Task.java                # Entity class representing a task
│   ├── repository/
│   │   └── TaskRepository.java      # JPA repository for Task entity
│   ├── controller/
│   │   └── TaskController.java      # Handles all web requests
│   └── TodolistappApplication.java  # Main Spring Boot application
│
├── src/main/resources/
│   ├── templates/
│   │   └── index.html               # Frontend view (Thymeleaf template)
│   └── application.properties       # App configuration (e.g., database setup)
│
└── pom.xml                          # Maven dependencies
```

---

## ⚙️ Technologies Used

| Component | Technology |
|------------|-------------|
| Backend | Spring Boot 3, Spring MVC, Spring Data JPA |
| Frontend | Thymeleaf, HTML5, CSS3, Bootstrap 5 |
| Database | H2 (in-memory) or MySQL |
| Build Tool | Maven |
| Language | Java 17+ |

---

## 💡 How It Works

1. The user opens the main page (`/`) which displays all tasks.
2. The form at the top allows adding a new task.
3. Each task in the list includes:
    - **Edit** button → Opens an inline or modal form for updating.
    - **Toggle** button → Switch between completed and pending.
    - **Delete** button → Removes the task from the list.
4. The top bar includes **search** and **filter** options to refine the task view.

---

## 🧠 Setup & Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/todolistapp.git
cd todolistapp
```

### 2. Build and Run the App
```bash
mvn spring-boot:run
```

### 3. Open in Browser
```
http://localhost:8080
```

---

## 🖼️ Preview (Upgraded UI)

| Add & View Tasks | Edit & Filter |
|------------------|---------------|
| ![Add tasks screenshot](https://via.placeholder.com/400x200?text=Add+Tasks+UI) | ![Edit modal screenshot](https://via.placeholder.com/400x200?text=Edit+and+Filter+UI) |

---

## 🧰 Future Improvements
- Add user authentication and profiles.
- Integrate task categories and priorities.
- Implement REST API for external access.
- Connect with a mobile app frontend (Flutter or React Native).

---

## 👨‍💻 Author
**Le Bao Khoa**  
A Java developer passionate about learning, building, and improving clean, user-friendly applications.

---

## 📄 License
This project is licensed under the MIT License – feel free to use and modify it.
