# Task Tracker CLI

A simple **command-line interface (CLI)** task-tracker application to manage a to-do list: add, update, delete tasks, change status, and persist them in a JSON file.  
Based on the Task Tracker project specification from roadmap.sh. :contentReference[oaicite:2]{index=2}

## Table of Contents
- [Features](#features)
- [Task Properties](#task-properties)
- [Getting started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setup & Run](#setup-and-run)
- [Error Handling & Edge Cases](#error-handling-and-edge-cases)
- [Known issues](#known-issues)
- [Licence](#licence)


## Features
- Add a new task (description, timestamp, default status `todo`)  
- Update an existing task’s description  
- Delete a task by ID  
- Mark a task as **in-progress**  
- Mark a task as **done**  
- List **all** tasks  
- List tasks by status: `todo`, `in-progress`, `done`  

## Task Properties 
Each task contains:

| Property    | Description                          |
|-------------|--------------------------------------|
| `id`        | Unique identifier (integer)          |
| `description` | Short string describing the task   |
| `status`    | One of: `todo`, `in-progress`, `done` |
| `createdAt` | Date/time when task was created      |
| `updatedAt` | Date/time when task was last updated |

Tasks are stored in a JSON file in the current directory; the file is created if it doesn’t exist.  

## Getting Started
### Prerequisites
- Java JDK (version 8+)  

### Setup and Run
1. Clone the project directory.  

## Error Handling and Edge Cases
- If the JSON storage file doesn’t exist — create it on first run.  
- If user provides invalid ID (non-existent) for update/delete/mark — show an error message.  
- Handle invalid command or missing arguments gracefully.  
- Ensure JSON read/write errors (e.g. malformed file) are caught and reported.  

## Known Issues
no issues currently found

## License
This project is for personal/learning use based on [Roadmap.sh Task Tracker Project]("https://roadmap.sh/projects/task-tracker?fl=0") spec.  

