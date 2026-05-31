# Lab 0 Student Submissions

Welcome! Follow these instructions to complete Lab 0 and submit your work.

---

## Step-by-Step Instructions

### Step 0: Fork this repo

### Step 1: Clone the Repository and Pull Latest Changes from Main

First, make sure you have the latest version of the code from the main branch:

```bash
# Clone the repository (do this once)
git clone <repository-url>
cd <repository-folder>

# Fetch the latest changes from main
git fetch origin

# Switch to main and pull the latest commits
git checkout main
git pull origin main
```

### Step 2: Create a Branch with Your Name

Create a new branch for your work using your name (use lowercase, hyphens instead of spaces):

```bash
# Create and switch to your new branch
git checkout -b firstname-lastname

# Example (use your name please not mine):
# git checkout -b christin-mugisha
```

### Step 3: Make Your Changes

Edit the student roster table and add your information:

1. Add your name in the same format as the first entry (Last Name, First Name)
2. Fill in your Student ID
3. Add your GitHub username (your @handle, e.g., @username)
4. Add your Humber email (format: firstname.lastname@humber.ca or n01233456789@humber.ca)
5. Mark Lab 0 as complete with ✅ or any other emoji :)
6. Add your Group Name (Note: This is **optional**; you can leave it blank if you are not in a group yet)
7. You can join groups through **Blackboard**. A sign-up link will be posted to let you join/form a group.
8. The deadline for getting into groups is **Sunday, May 31st**!

### Step 4: Commit Your Changes

Once you've updated your row in the table, commit your changes:

```bash
# Stage your changes
git add .

# Commit with a clear message
git commit -m "lab 0 completed"
```

### Step 5: Push Your Branch to GitHub

Push your branch to the remote repository:

```bash
# Push your branch
git push origin firstname-lastname

# Example pushing to your branch:
# git push origin firstname-lastname
```

### Step 6: Create a Pull Request

Go to the GitHub repository in your browser and create a pull request:

1. Navigate to the **Pull Requests** tab
2. Click the **New Pull Request** button
3. Set the base branch to **main**
4. Set the compare branch to **your-branch-name** (e.g., zainab-aamir)
5. Add a title: "Add [Your Name] to Lab 0 roster"
6. Click **Create Pull Request**

Alternatively, GitHub will often show a prompt after you push—just click "Create Pull Request" there.

### Step 7:Submit the link to Blackboard for marks

Once your PR is created, submit the **PR link/number** on Blackboard. I will review and merge the changes here.

After the PR is merged, you're officially done with Lab 0! ✅

---

## Important Guidelines

- **Don't modify other students' rows!** Only edit your own line
- **Keep the format consistent** (use pipes | to separate columns)
- **GitHub username** is your @handle, not your name
- **Humber email** should be: firstname.lastname@student.humber.ca
- **Branch name** should use your full name (e.g., firstname-lastname)
- **Keep main branch clean**—always do your work on your personal branch

---

## Student Roster

| #   | Name              | Student ID    | GitHub Username | Humber Email                  | Lab 0 Complete | Group Name |
| --- | ----------------- | ------------- | --------------- | ----------------------------- | -------------- | ---------- |
| 0 | Christin, Mugisha | [N0123456789] | @christinhumber | ly-christin.mugisha@humber.ca | [🔥] Completed | [N/A] |
| 1 | Hudson, Alton     | [N01773328]   | @altonhudson    | n01773328@humber.ca           | ✅ Completed   | [N/A] |
| 2 | Bonora, Michael | [N01205927] | @MichaelAB73 | n01205927@humber.ca | [🔥] Completed | [14] |
| 3 | Beyza, Yigitoglu | [N01733699] | @beyzay | n01733699@humber.ca | [🔥] Completed | [N/A] |
| 4 | Svetlozara, Godzheva | [N01754024] | @svetlozara-godzheva | n01754024@humber.ca | [✅] Completed | [N/A] |
| 5 | Dugh, Garv | N01763558 | @n01763558GarvDugh | n01763558@humber.ca | ✅ Completed | |
| 6 | Huynh Khoa, Le    | [N01768983]   | @benjaminkle    | n01768983@humber.ca           | [✅] Completed | [N/A]      |
| 7 | Anthony, Murphy   | [N00771201]   | @awrmurphy      | mrpn0073@humber.ca            | [🌊] Completed | [N/A]      |
| 8 | Chaves, Samuel   | [N01771143]   | @Samuuca1      | N01771143@humber.ca            | [⚡] Completed | [Group 7]      |
| 9 | Daniel, Gardiner | [N01773473] | @dangardiner90 | n01773473@student.humber.ca | [🔥] Completed | [N/A] |
| 10 | Scott, Woodhouse  | [N01774081]   | @WoodShack      | n01774081@humber.ca           | [🔥] Completed | [New Group 14] |
| 11 | Lisa, Tarnow | [N00233140] | @LisaTarn | trnl0207@humber.ca | [✅] Completed | [N/A] |
| 12 | Samuel, Ilesanmi  | [N01666340]   | @Khrisdain      | N01666340@humber.ca           | [🔥] Completed | [Group 12] |
| 13 | Bernardino, Princess Krish Anne | [N01708883] | @pbxcess | N01708883@humber.ca | [❤️‍🔥] Completed | [Group 3] |it 