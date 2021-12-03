import requests

headers={
"Name": "Shivani Sharma", "Email": "shivihalo@gmail.com","College": "VIT Bhopal","StudentId":"18BCE10251","Password":"c2hpdmloYWxvQGdtYWlsLmNvbQ=="



}
response = requests.put(url="https://prod-24.centralindia.logic.azure.com/workflows/78d6df0ed1384ee0b7d04918f1a32b85/triggers/request/paths/invoke?api-version=2016-10-01&sp=%2Ftriggers%2Frequest%2Frun&sv=1.0&sig=i6gXuS7-5_fFVf-0u8M4UfymINDULCMifsscfN5cPKM",headers=headers)


