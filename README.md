# 단기집중 코틀린 프로그래밍 프로젝트
2분반 Chan Kim

## 제안서 때와 달라진 점
1. 탭뷰와 프래그먼트를 통한 ui에서 프래그먼트에 리사이클러뷰를 구현하려 했으나, 한 액티비티 내에서 바로 리사이클러뷰를 구현하였습니다.
2. 상세 페이지에서 현재 위치와 목적지 위치를 통해 거리를 구하는 부분을 구현하지 않았습니다.

## 시작 화면
<img src="https://user-images.githubusercontent.com/66289619/153208299-8e4b76cd-1ffa-42bb-8751-948b243a61cd.gif" width="200">
코틀린 이미지, 그리고 TextView를 이용하여 이미지와 텍스트가 Fade-In 하도록 애니메이션을 구성하였습니다.

## 메인 화면
<img src="https://user-images.githubusercontent.com/66289619/153206762-3b2107d7-c138-43eb-8ad1-f97b3781b8fc.jpg" width="200">
메인 화면에서는 리사이클러뷰를 이용하여 각 도시 정보가 출력되며, 리사이클러뷰의 요소를 클릭하여 상세 페이지로 이동할 수 있습니다.

## 상세 페이지 1
<img src="https://user-images.githubusercontent.com/66289619/153206768-4e88f826-11c7-44e9-8bd0-f7032397f6d6.jpg" width="200">
상세 페이지에서는 메인 화면의 리사이클러뷰의 element로부터 받은 값을 상세히 표시합니다. Intent를 통해 값을 전달하며, 상세 페이지에서는 유튜브 동영상을 재생할 수 있습니다.

## 상세 페이지 2
<img src="https://user-images.githubusercontent.com/66289619/153206774-790cee34-0ca5-4d11-8cfe-117161e7bff8.jpg" width="200">

## 상세 페이지 3
<img src="https://user-images.githubusercontent.com/66289619/153207779-67a37a08-d655-4cfd-8824-568eb7ea07c2.jpg" width="200">
때때로 동영상에 오류가 발생하는 점이 있습니다. AVD에서나, 실제 스마트폰에서나 동일한 문제가 발생하는 것을 확인했습니다.
