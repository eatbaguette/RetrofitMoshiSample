import requests
import json

# 定数
BASE_URL = "https://connpass.com/api/v1/event/"
PATH = "?keyword=python"

url = BASE_URL + PATH

response = requests.get(url).json()

print(json.dumps(response, indent = 4, ensure_ascii=False))


