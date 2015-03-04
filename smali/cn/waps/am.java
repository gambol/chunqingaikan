package cn.waps; class am { void a() { int a;
a=0;// .class public Lcn/waps/am;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcn/waps/am;
a=0;// 
a=0;// .field private static c:Landroid/content/Context;
a=0;// 
a=0;// .field private static e:Lcn/waps/ag;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// .field private d:Lcn/waps/ao;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Ljava/lang/String;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/waps/am;->e:Lcn/waps/ag;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Lcn/waps/ag;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/am;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/am;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/am;->h:Ljava/lang/String;
a=0;// 
a=0;//     sput-object p1, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     sput-object p2, Lcn/waps/am;->e:Lcn/waps/ag;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/am;->f:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "errorLog_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".txt"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/am;->h:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcn/waps/ag;Ljava/lang/String;)Lcn/waps/am;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->b:Lcn/waps/am;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/am;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/am;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/am;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcn/waps/am;-><init>(Landroid/content/Context;Lcn/waps/ag;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/am;);
a=0;//     sput-object v0, Lcn/waps/am;->b:Lcn/waps/am;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/waps/am;->b:Lcn/waps/am;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/am;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/waps/am;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/Throwable;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcn/waps/am;->b(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->e:Lcn/waps/ag;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ag;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/waps/am;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Lcn/waps/ag;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->e:Lcn/waps/ag;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ag;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/waps/am;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/am;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/Throwable;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x1388
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/StringWriter;);
a=0;//     new-instance v3, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/PrintWriter;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "Exception"
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V
a=0;// 
a=0;//     const-string v0, "/Android/data/cache"
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v4, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/16 v4, 0x1388
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/PrintWriter;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "["
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "]"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     sget-object v2, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iget-object v2, p0, Lcn/waps/am;->g:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/am;->h:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1, v2, v3, v0, v4}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(PosShort);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/waps/am;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/am;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "/Android/data/cache"
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     sget-object v2, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iget-object v2, p0, Lcn/waps/am;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcn/waps/SDKUtils;->loadStringFromLocal(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     iput-object v0, p0, Lcn/waps/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->e:Lcn/waps/ag;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcn/waps/am;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/waps/am;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/waps/ao;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ao;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcn/waps/ao;-><init>(Lcn/waps/am;Lcn/waps/an;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ao;);
a=0;//     iput-object v0, p0, Lcn/waps/am;->d:Lcn/waps/ao;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/am;->d:Lcn/waps/ao;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/ao;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcn/waps/am;->a(Ljava/lang/Throwable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const-wide/16 v0, 0xbb8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/Process;->myPid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
a=0;// 
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/lang/System;->exit(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(LongLo);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_1
a=0;// .end method
}}
