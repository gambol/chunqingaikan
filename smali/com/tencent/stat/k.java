package com.tencent.stat; class k { void a() { int a;
a=0;// .class Lcom/tencent/stat/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;// .field private b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;// .field private c:Lcom/tencent/stat/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/stat/a/e;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/k;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/k;->b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/l;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/stat/l;-><init>(Lcom/tencent/stat/k;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/l;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/k;->c:Lcom/tencent/stat/c;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatSendStrategy()Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/k;->b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/k;)Lcom/tencent/stat/a/e;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/n;->b()Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/n;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/n;->b()Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/n;->b()Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/n;->a(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/stat/k;->a(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/d;->b()Lcom/tencent/stat/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/d;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/k;->c:Lcom/tencent/stat/c;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/c;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/d;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/a/e;->a()Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/a/f;->c:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/f;);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/a/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Event length exceed StatConfig.getMaxReportEventLength(): "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxSessionStatReportCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getCurSessionStatReportCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxSessionStatReportCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "Times for reporting events has reached the limit of StatConfig.getMaxSessionStatReportCount() in current session."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->c()V
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Lauch stat task in thread:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/a/e;->c()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableSmartReporting()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatReportStrategy;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatReportStrategy;->ONLY_WIFI_NO_CACHE:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     if-eq v1, v2, :cond_6
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatReportStrategy;->INSTANT:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatReportStrategy;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/k;->b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v1, Lcom/tencent/stat/h;->a:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/k;->b:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/stat/StatReportStrategy;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Invalid stat strategy:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatSendStrategy()Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-direct {p0}, Lcom/tencent/stat/k;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->e(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/stat/k;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/a/e;->c()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/m;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/m;);
a=0;//     invoke-direct {v2, p0}, Lcom/tencent/stat/m;-><init>(Lcom/tencent/stat/k;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/m;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     :try_start_2
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/n;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/k;->a:Lcom/tencent/stat/a/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/a/e;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     const-string v1, "last_period_ts"
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long/2addr v4, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     const-wide/32 v6, 0xea60
a=0;// 
a=0;//     div-long/2addr v4, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getSendPeriodMinutes()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v6, v2
a=0;// 
a=0;//     cmp-long v2, v4, v6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/n;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v2, v4}, Lcom/tencent/stat/n;->a(I)V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;J)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v1=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->e(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/stat/k;->a(Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
}}
