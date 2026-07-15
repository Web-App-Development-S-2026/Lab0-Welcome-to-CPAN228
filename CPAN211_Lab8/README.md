# Course Information
* **Course:** CPAN 211
* **Topic:** Introduction to Data Structures (Lists, Sets, Maps, Queues)

## Getting Started
This is a starter template for your lab assignments. Follow the GitHub setup below before beginning your work.

### GitHub Setup
#### Fork the Repository
1. Go to the repository on GitHub.
2. Click the **Fork** button in the top-right corner (**VERY IMPORTANT!!!!**).
3. This creates your own copy of the project.

#### Clone Your Fork
```bash
git clone https://github.com/YOUR-USERNAME/IntroToDataStructure_Lab.git
cd IntroToDataStructure_Lab
```

#### Add Upstream Remote
```bash
git remote add upstream https://github.com/ChristinHumber/IntroToDataStructure_Lab.git
```

#### Pull Latest Changes
```bash
git pull upstream main
```

#### Create a Feature Branch
```bash
git checkout -b feature/lab-yourname
```
*Replace `yourname` with your actual name (e.g., `feature/lab1-john-doe` or `feature/lab-john-doe`).*

---

# Lab: Postfix Expression Evaluator

## Description
Postfix notation is a way of writing expressions without using parentheses. For example, the expression `(1 + 2) * 3` would be written as `1 2 + 3 *`. 

A postfix expression is evaluated using a stack:
1. Scan a postfix expression from left to right.
2. A variable or constant (operand) is pushed into the stack.
3. When an operator is encountered, apply the operator with the top two operands in the stack and replace the two operands with the result.

Write a program to evaluate postfix expressions. Pass the expression as argument in one string.

## Visual Example: Evaluating `1 2 + 3 *`

The following table illustrates how the stack changes at each step of scanning the expression `1 2 + 3 *`:

### Step-by-Step Execution Table

| Step | Scanned Token | Stack Action | Stack State (Bottom &rarr; Top) | Description / Calculation |
| :---: | :---: | :---: | :---: | :--- |
| **1** | `1` | Push | `[1]` | Push operand `1` onto stack. |
| **2** | `2` | Push | `[1, 2]` | Push operand `2` onto stack. |
| **3** | `+` | Pop, Pop, Compute, Push | `[3]` | Pop `2` and `1`. Compute `1 + 2 = 3`. Push `3` back. |
| **4** | `3` | Push | `[3, 3]` | Push operand `3` onto stack. |
| **5** | `*` | Pop, Pop, Compute, Push | `[9]` | Pop `3` and `3`. Compute `3 * 3 = 9`. Push `9` back. |

