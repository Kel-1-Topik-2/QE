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
      |  Dr.Bagas    |  12344 | Dokter Gigi |   BagasBedah   |   Bagas21     |
      |     21122    |  bagas |    21122    |   ,.;'[]-==-   |   ,.;'[]-==-  |
      |     21122    |  12344 | Dokter Gigi |   BagasBedah   |   Bagas21     |
      |  Dr.Bagas    |  bagas | Dokter Gigi |   BagasBedah   |   Bagas21     |
      |  Dr.Bagas    | 12344  | 00990112122 |  BagasBedah    |   Bagas21     |
      |  Dr.Bagas    |  12344 | Dokter Gigi |   ,.;'[]-==-   |   Bagas21     |
      |  Dr.Bagas    |  12344 | Dokter Gigi |   BagasBedah   |  ,.;'[]-==-   |