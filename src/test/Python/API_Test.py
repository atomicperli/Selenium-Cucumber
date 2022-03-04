
import requests
import unittest

class TestAPI(unittest.TestCase):
    

    def test_post_request(self):

        payload = {
            "name":"TestSensivity",
            "description":"Intel Data.CRM.MAG Account", 
            "domainKey":"ra6a3959e9bde14993"
        }
        response = requests.post('http://host1:8082/api/v2/tag/', json=payload)
        assert response.status_code == 201, 'Response Status code is not 201, instead got ' + response.status_code


    def test_get_request(self):
        url = "http://host:8082/api/v2/tag/byname?tagname=TestSensivity"
        response = requests.get(url)
        assert response.status_code == 200, 'Response Status code is not 200, instead got ' + response.status_code

if __name__ == '__main__':
    unittest.main()



