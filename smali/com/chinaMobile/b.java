package com.chinaMobile; class b { void a() { int a;
a=0;// .class public final Lcom/chinaMobile/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/chinaMobile/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/chinaMobile/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/chinaMobile/b;);
a=0;//     invoke-direct {v0}, Lcom/chinaMobile/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/chinaMobile/b;);
a=0;//     sput-object v0, Lcom/chinaMobile/b;->a:Lcom/chinaMobile/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/chinaMobile/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/chinaMobile/b;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/chinaMobile/b;->a:Lcom/chinaMobile/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/chinaMobile/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/chinaMobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/chinaMobile/b;->c:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/StackTraceElement;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "CrashHandler"
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/chinaMobile/f;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/chinaMobile/b;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/chinaMobile/MobileAgent;->onErr(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/b;->c:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/b;->c:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v1, v2, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
