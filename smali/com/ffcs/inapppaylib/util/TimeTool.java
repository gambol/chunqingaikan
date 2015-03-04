package com.ffcs.inapppaylib.util; class TimeTool { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/util/TimeTool;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TimeTool.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 7
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/util/TimeTool;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static Date2String(JLjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "date"    # J
a=0;//     .param p2, "pattern"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-direct {v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 22
a=0;//     .local v0, "format":Ljava/text/SimpleDateFormat;
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static DateStr2Long(Ljava/lang/String;Ljava/lang/String;)J
a=0;//     .locals 3
a=0;//     .param p0, "date"    # Ljava/lang/String;
a=0;//     .param p1, "pattern"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-direct {v1, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Date;->getTime()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 30
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 28
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "e":Ljava/text/ParseException;
a=0;//     #v0=(Reference,Ljava/text/ParseException;);
a=0;//     invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V
a=0;// 
a=0;//     .line 30
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTimestamp()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/ffcs/inapppaylib/util/TimeTool;->Date2String(JLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
