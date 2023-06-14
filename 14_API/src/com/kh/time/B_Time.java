package com.kh.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/*
 * java.time 패키지
 * 
 * - Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공 (JDK 1.8)
 * - LocalDate, LocalTime, LocalDateTime, ZoneDateTime 클래스 포함
 * - 날짜와 시간에 대한 다양한 메서드를 제공
 */
public class B_Time {

	public static void main(String[] args) {
		B_Time b = new B_Time();
//		b.method1();
//		b.method2();
//		b.method3();
		b.method4();
	}

	public void method1() {

		/*
		 * LocalDateTime - 날짜와 시간 정보를 모두 저장
		 */

		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now : " + now);

		
		// 날짜 지정

		LocalDateTime when = LocalDateTime.of(2023, 11, 1, 17, 50, 0); // date 의 set과 동일
		System.out.println("when : " + when);

		
		// ZonedDateTime : LocalDateTime(날짜, 시간) + 시간대

		System.out.println("ZonedDateTime : " + ZonedDateTime.now());

		
		// 년, 월, 일, 요일, 시, 분 ,초

		System.out.println("년도 : " + now.getYear());
		System.out.println("월 : " + now.getMonth()); // 영어
		System.out.println("월 : " + now.getMonthValue()); // 숫자
		System.out.println("일 : " + now.getDayOfMonth()); // 14 -> 해당 월의 1일부터 얼마나 왔는지
		System.out.println("일 : " + now.getDayOfYear()); // 165 -> 해당 년도의 1월 1일부터 얼마나 왔는지
		System.out.println("요일 : " + now.getDayOfWeek());
		System.out.println("시 : " + now.getHour());
		System.out.println("분 : " + now.getMinute());
		System.out.println("초 : " + now.getSecond());

		System.out.println();

		
		// 날짜 조작

		LocalDateTime plusDays = now.plusDays(1).plusMonths(2).plusYears(1);
		System.out.println("plusDays : " + plusDays);

		System.out.println("isAfter : " + now.isAfter(plusDays)); // false, isAfter -> 오늘이 인자 날짜 이후인가(boolean)
		System.out.println("isBefore : " + now.isBefore(plusDays)); // true, isBefore -> 오늘이 인자 날짜 이전인가(boolean)

		LocalDateTime minusDays = now.minusMonths(2).minusDays(10).minusYears(3);
		System.out.println("minusDays : " + minusDays);

		LocalDateTime withDays = now.withYear(2025).withMonth(3).withDayOfMonth(1);
		System.out.println("withDays : " + withDays);

		System.out.println();

		
		/*
		 * LocalDate - 날짜 정보만 저장
		 * 
		 */

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);

		localDate = LocalDate.of(2023, 11, 1);
		System.out.println("localDate2 : " + localDate);

		localDate = now.toLocalDate(); // LocalDateTime을 LocalDate 타입으로 변경
		System.out.println("localDate3 : " + localDate);

		System.out.println();

		
		/*
		 * LocalTime - 시간 정보만 저장
		 */

		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);

		localTime = LocalTime.of(9, 27, 34);
		System.out.println("localTime2 : " + localTime);

		localTime = now.toLocalTime();
		System.out.println("localTime3 : " + localTime);

	}

	
	/*
	 * Period와 Duration
	 * 
	 * - 날짜와 시간 간격을 표현하기 위한 클래스 
	 * - Period : 두 날짜 간의 차이 
	 * - Duration : 시간의 차이
	 */
	public void method2() {
		/*
		 * between() : 두 날짜의 차이
		 */

		
		LocalDate date1 = LocalDate.of(2023, 1, 1);
		LocalDate date2 = LocalDate.of(2024, 12, 31);

		Period pe = Period.between(date1, date2);
		System.out.println("Period : " + pe); // 년, 개월, 일 순으로 차이 출력

		System.out.println("years : " + pe.getYears());
		System.out.println("years : " + pe.get(ChronoUnit.YEARS));

		System.out.println("months : " + pe.getMonths());
		System.out.println("months : " + pe.get(ChronoUnit.MONTHS));

		System.out.println("days : " + pe.getDays());
		System.out.println("days : " + pe.get(ChronoUnit.DAYS));

		pe = pe.plusYears(3).multipliedBy(2); // 3년을 더하고, 2배를 곱한다.
		System.out.println("연산 후 : " + pe);

		System.out.println();
		
		
		LocalTime time1 = LocalTime.of(00, 00, 00);
		LocalTime time2 = LocalTime.of(10, 36, 56);
		
		Duration du = Duration.between(time1, time2);
		System.out.println("duration : " + du);
		
		du = du.plusHours(1).dividedBy(60);
		
		LocalTime time = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println("HOURS : " + time.getHour());
		System.out.println("MINUTE : " + time.getMinute());
		System.out.println("SECOND : " + time.getSecond());
		
		
		
		

	}

	public void method3() {
		
		// 문자열을 LocalDate 객체로 파싱
		LocalDate date = LocalDate.parse("2023-05-11");
		System.out.println(date);
		
		date = LocalDate.parse("2023.05.11", DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		System.out.println(date);
		
		date = LocalDate.parse("20230511", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date);
		
		//
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println(today.format(ofPattern));
		
		//
		System.out.println(today.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(today.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		
		// ZonedDateTime Format~
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
	}

	//D-Day 계산기 : 년월일을 입력하여 디데이 계산

	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(sc.nextLine());
		System.out.print("일 : ");
		int day = Integer.parseInt(sc.nextLine());
		
		LocalDate nowDate = LocalDate.now();
		LocalDate inputDate = LocalDate.of(year, month, day);
		
		long dDay = ChronoUnit.DAYS.between(nowDate, inputDate);
		dDay= nowDate.until(inputDate, ChronoUnit.DAYS);
		
		if(dDay == 0) {
			
			System.out.println("오늘");
		}
		
		else if(dDay > 0) {
			System.out.println("D-" + dDay);
		}else {
			System.out.println(-(dDay) + "일 지났습니다.");
		}
	}
}
