"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def postorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        if root == None:
            return []
        
        stack = [root]
        result = []
        
        while stack:
            temp = stack.pop()
            result.append(temp.val)
            
            [stack.append(x) for x in temp.children]
            
        return result[::-1]