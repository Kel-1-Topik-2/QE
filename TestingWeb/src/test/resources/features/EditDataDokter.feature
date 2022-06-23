@EditDokterData
Feature: Edit Data Dokter - Admin

  Scenario Outline: As a admin i want to edit data dokter
    Given Open page data dokter
    And Click Detail dokter data
    When Valid data detail dokter
    And Click button edit profil
    Then I input edit "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" dokter
    And Click button simpan
    And Valid edit data
    Examples:
      |namalengkap|idi|spesialis|username|pass|
      |   21122   |  bagas | 00942534590 |   *Y*(^21333   |   *Y*(^21333  |
      |   21122   |  12344 | Dokter Gigi |   BagasBedah   |   BagasBedah  |
      |  Bagas    |  bagas | Dokter Gigi |   BagasBedah   |   BagasBedah  |
      |  Bagas    | 12344  | 00990112122 |  BagasBedah    |   BagasBedah  |
      |  Bagas    |  12344 | Dokter Gigi |   *Y*(^21333   |   BagasBedah  |
      |  Bagas    |  12344 | Dokter Gigi |   BagasBedah   |   *Y*(^21333  |