"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def maxDepth(self, root):
        """
        :type root: Node
        :rtype: int
        """
        maxdepth = 0
        if root == None:
            return 0
        stack = [root]
        while stack:
            level_stack = []
            while stack:
                temp = stack.pop()
                if temp.children:
                    level_stack +=temp.children
            stack = level_stack
            maxdepth +=1
        return maxdepth