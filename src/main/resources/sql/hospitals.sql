SELECT * FROM `likelion-db1`.nation_wide_hospitals;

-- 경기도 수원시에 있는 피부과를 모두 찾아보세요

select hospital_name, full_address from `likelion-db1`.nation_wide_hospitals where full_address like '경기도 수원시%' and hospital_name like '%피부과%';

-- 특정 구의 - 보건진료소, 보건지소, 보건소 모두 찾기
select business_type_name, hospital_name, road_name_address
from `likelion-db1`.nation_wide_hospitals
where business_type_name in ('보건소', '보건지소', '보건진료소')
;

-- 병상 수가 10개 이상 20개 미만인 병원 조회.
select hospital_name, patient_room_count from `likelion-db1`.nation_wide_hospitals
where patient_room_count between 10 and 20 order by patient_room_count asc;