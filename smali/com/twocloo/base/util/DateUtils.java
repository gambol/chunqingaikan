package com.twocloo.base.util; class DateUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/DateUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DateUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static DAY:J
a=0;// 
a=0;// .field public static HOUR:J
a=0;// 
a=0;// .field public static MINUTE:J
a=0;// 
a=0;// .field public static SECOND:J
a=0;// 
a=0;// .field public static final format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// .field public static final format_hm:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x3c
a=0;// 
a=0;//     .line 18
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/twocloo/base/util/DateUtils;->SECOND:J
a=0;// 
a=0;//     .line 19
a=0;//     sget-wide v0, Lcom/twocloo/base/util/DateUtils;->SECOND:J
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/DateUtils;->MINUTE:J
a=0;// 
a=0;//     .line 20
a=0;//     sget-wide v0, Lcom/twocloo/base/util/DateUtils;->MINUTE:J
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/DateUtils;->HOUR:J
a=0;// 
a=0;//     .line 21
a=0;//     sget-wide v0, Lcom/twocloo/base/util/DateUtils;->HOUR:J
a=0;// 
a=0;//     const-wide/16 v2, 0x18
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/DateUtils;->DAY:J
a=0;// 
a=0;//     .line 23
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "HH:mm"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/twocloo/base/util/DateUtils;->format_hm:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/DateUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static after(Ljava/util/Date;)Z
a=0;//     .locals 5
a=0;//     .param p0, "date"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-virtual {p0}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 153
a=0;//     .local v2, "time":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "now":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v4, v0, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 157
a=0;//     :goto_0
a=0;//     #v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static format(J)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "time"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long/2addr p0, v0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/DateUtils;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static format(Ljava/util/Date;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "date"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static formatHM(Ljava/util/Date;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "date"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget-object v0, Lcom/twocloo/base/util/DateUtils;->format_hm:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getTime(Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .param p0, "dateStr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v2, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "date":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getTime()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 50
a=0;//     .end local v0    # "date":Ljava/util/Date;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(LongLo);v3=(LongHi);
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 46
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 47
a=0;//     .local v1, "e":Ljava/text/ParseException;
a=0;//     #v1=(Reference,Ljava/text/ParseException;);
a=0;//     invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V
a=0;// 
a=0;//     .line 50
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isInside(Ljava/lang/String;J)Z
a=0;//     .locals 6
a=0;//     .param p0, "dateStr"    # Ljava/lang/String;
a=0;//     .param p1, "time"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/DateUtils;->getTime(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "last":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 124
a=0;//     .local v2, "now":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v4, v2, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, p1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isOutHour(Ljava/lang/String;J)Z
a=0;//     .locals 6
a=0;//     .param p0, "dateStr"    # Ljava/lang/String;
a=0;//     .param p1, "time"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/DateUtils;->getTime(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "last":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 138
a=0;//     .local v2, "now":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v4, v2, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, p1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isSameDay(JJ)Z
a=0;//     .locals 4
a=0;//     .param p0, "data1"    # J
a=0;//     .param p2, "data2"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "date1":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1, p2, p3}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 68
a=0;//     .local v1, "date2":Ljava/util/Date;
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/DateUtils;->isSameDay(Ljava/util/Date;Ljava/util/Date;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 73
a=0;//     .end local v0    # "date1":Ljava/util/Date;
a=0;//     .end local v1    # "date2":Ljava/util/Date;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 69
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isSameDay(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;//     .param p0, "dateStr1"    # Ljava/lang/String;
a=0;//     .param p1, "dateStr2"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v3=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v3, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "date1":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     sget-object v3, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     .local v1, "date2":Ljava/util/Date;
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/DateUtils;->isSameDay(Ljava/util/Date;Ljava/util/Date;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 93
a=0;//     .end local v0    # "date1":Ljava/util/Date;
a=0;//     .end local v1    # "date2":Ljava/util/Date;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 89
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 90
a=0;//     .local v2, "e":Ljava/text/ParseException;
a=0;//     #v2=(Reference,Ljava/text/ParseException;);
a=0;//     invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z
a=0;//     .locals 5
a=0;//     .param p0, "cal1"    # Ljava/util/Calendar;
a=0;//     .param p1, "cal2"    # Ljava/util/Calendar;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "The date must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isSameDay(Ljava/util/Date;Ljava/util/Date;)Z
a=0;//     .locals 4
a=0;//     .param p0, "date1"    # Ljava/util/Date;
a=0;//     .param p1, "date2"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "The date must not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "cal1":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     .local v1, "cal2":Ljava/util/Calendar;
a=0;//     #v1=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/DateUtils;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public static now()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/twocloo/base/util/DateUtils;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static schedule(Ljava/lang/Runnable;Ljava/util/Date;)Ljava/util/Timer;
a=0;//     .locals 4
a=0;//     .param p0, "runnable"    # Ljava/lang/Runnable;
a=0;//     .param p1, "date"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "cal":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v1, Ljava/util/Timer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Timer;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v3}, Ljava/util/Timer;-><init>(Z)V
a=0;// 
a=0;//     .line 186
a=0;//     .local v1, "mTimer":Ljava/util/Timer;
a=0;//     #v1=(Reference,Ljava/util/Timer;);
a=0;//     new-instance v2, Lcom/twocloo/base/util/DateUtils$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/util/DateUtils$1;);
a=0;//     invoke-direct {v2, v0, p0}, Lcom/twocloo/base/util/DateUtils$1;-><init>(Ljava/util/Calendar;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "timerTask":Ljava/util/TimerTask;
a=0;//     #v2=(Reference,Lcom/twocloo/base/util/DateUtils$1;);
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
a=0;// 
a=0;//     .line 205
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static schedule(Ljava/lang/Runnable;III)V
a=0;//     .locals 2
a=0;//     .param p0, "runnable"    # Ljava/lang/Runnable;
a=0;//     .param p1, "hour"    # I
a=0;//     .param p2, "minute"    # I
a=0;//     .param p3, "second"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     .local v0, "cal":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 170
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 171
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/base/util/DateUtils;->schedule(Ljava/lang/Runnable;Ljava/util/Date;)Ljava/util/Timer;
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
}}
