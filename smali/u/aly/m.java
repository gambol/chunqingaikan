package u.aly; class m { void a() { int a;
a=0;// .class public Lu/aly/m;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CrashHandler.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// .field private b:Lu/aly/t;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lu/aly/m;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 21
a=0;//     :cond_0
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lu/aly/m;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     .line 22
a=0;//     invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     sget-boolean v0, Lcom/umeng/analytics/AnalyticsConfig;->CATCH_EXCEPTION:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lu/aly/m;->b:Lu/aly/t;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/t;);
a=0;//     invoke-interface {v0, p1}, Lu/aly/t;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lu/aly/m;->b:Lu/aly/t;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/t;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Lu/aly/t;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lu/aly/t;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iput-object p1, p0, Lu/aly/m;->b:Lu/aly/t;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0, p2}, Lu/aly/m;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lu/aly/m;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lu/aly/m;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lu/aly/m;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
