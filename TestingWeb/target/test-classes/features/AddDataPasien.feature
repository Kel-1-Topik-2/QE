@AddPatientData
Feature: Add Data Pasien - Admin

  Scenario Outline: As a admin i want to add data pasien
    Given Open page data pasien
    When Click button tambah data
    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And I click button jenis kelamin patient
    And Click button simpan
    And Valid data pasien
    Examples:
    |namalengkap|nik|usia|nomortelepon|alamat|
    |   Bagas   |  1234479680 | 20 |   01294657612   |   perumahan  |
    |           |  1234479680 | 20 |   01294657612   |   perumahan  |
    |  Bagas    |             | 20 |   01294657612   |   perumahan  |
    |  Bagas    | 1234479680  |    |  01294657612    |   perumahan  |
    |  Bagas    |  1234479680 | 20 |                 |   perumahan  |
    |  Bagas    |  1234479680 | 20 |   01294657612   |              |

  Scenario Outline: As a admin i want to add data pasien but not gander
    Given Open page data pasien
    When Click button tambah data
    Then I input "<namalengkap>" "<nik>" "<usia>" "<nomortelepon>" "<alamat>" patient
    And Click button simpan
    And Valid data pasien
    Examples:
      |namalengkap|nik|usia|nomortelepon|alamat|
      |   Bagas   |  1234479680 | 20 |   01294657612   |   perumahan  |