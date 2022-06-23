@AddDokterData
Feature: Add Data Dokter - Admin

  Scenario Outline: As a admin i want to add data dokter
    Given Open page data dokter
    When Click button tambah data
    Then I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" dokter
    And Click button simpan
    And Valid data dokter
    Examples:
      |namalengkap|idi|spesialis|username|pass|
      |   Bagas   |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  |
      |           |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  |
      |  Bagas    |        | Dokter Gigi |   BagasBedah   |   BagasBedah  |
      |  Bagas    | 12344  |             |  BagasBedah    |   BagasBedah  |
      |  Bagas    |  12344 | Dokter Gigi |                |   BagasBedah  |
      |  Bagas    |  12344 | Dokter Gigi |   BagasBedah   |               |