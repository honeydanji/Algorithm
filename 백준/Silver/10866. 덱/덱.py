class Deque:
    def __init__(self):
        self.items = []

    def push_front(self, x):
        self.items.insert(0, x)

    def push_back(self, x):
        self.items.append(x)

    def pop_front(self):
        if not self.is_empty():
            return self.items.pop(0)
        return -1

    def pop_back(self):
        if not self.is_empty():
            return self.items.pop()
        return -1

    def size(self):
        return len(self.items)

    def is_empty(self):
        return len(self.items) == 0

    def front(self):
        if not self.is_empty():
            return self.items[0]
        return -1

    def back(self):
        if not self.is_empty():
            return self.items[-1]
        return -1


def process_commands(commands):
    deque = Deque()
    results = []

    for command in commands:
        parts = command.split()
        operation = parts[0]

        if operation == "push_front":
            x = int(parts[1])
            deque.push_front(x)
        elif operation == "push_back":
            x = int(parts[1])
            deque.push_back(x)
        elif operation == "pop_front":
            results.append(deque.pop_front())
        elif operation == "pop_back":
            results.append(deque.pop_back())
        elif operation == "size":
            results.append(deque.size())
        elif operation == "empty":
            results.append(1 if deque.is_empty() else 0)
        elif operation == "front":
            results.append(deque.front())
        elif operation == "back":
            results.append(deque.back())

    return results


if __name__ == "__main__":
    N = int(input())
    commands = [input().strip() for _ in range(N)]

    results = process_commands(commands)

    for result in results:
        print(result)