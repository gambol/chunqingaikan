package com.twocloo.base.util; class DateUtils$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/util/DateUtils$1;
a=0;// .super Ljava/util/TimerTask;
a=0;// .source "DateUtils.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/util/DateUtils;->schedule(Ljava/lang/Runnable;Ljava/util/Date;)Ljava/util/Timer;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$cal:Ljava/util/Calendar;
a=0;// 
a=0;// .field private final synthetic val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/util/Calendar;Ljava/lang/Runnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/util/DateUtils$1;->val$cal:Ljava/util/Calendar;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/util/DateUtils$1;->val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 186
a=0;//     invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/DateUtils$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     .local v0, "now":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Lcom/twocloo/base/util/DateUtils$1;->val$cal:Ljava/util/Calendar;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const-string v1, "\u65f6\u95f4\u8fc7\u4e86\u9996\u6b21\u4e0d\u6267\u884c"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/util/DateUtils$1;->val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v1}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
