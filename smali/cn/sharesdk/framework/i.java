package cn.sharesdk.framework; class i { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;// .field private d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/sharesdk/framework/Platform;Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/i;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/i;->h:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/framework/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getVersion()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, p2, v0, v2}, Lcn/sharesdk/framework/PlatformDb;-><init>(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/i;->c:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/i;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/i;->j()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/sharesdk/framework/i;)Lcn/sharesdk/framework/Platform;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private j()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Null);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "covert_url"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2, v3, v4}, Lcn/sharesdk/framework/i;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v3, "false"
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/i;->h:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->setNetworkDevinfo()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v2}, Lcn/sharesdk/framework/ShareSDK;->a(Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(One);
a=0;//     invoke-static {v2}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Failed to parse network dev-info: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(One);v2=(Reference,Ljava/util/HashMap;);v3=(Boolean);v4=(Null);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "covert_url"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-virtual {p0, v2, v3, v4}, Lcn/sharesdk/framework/i;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v3, "false"
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_8
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     iput-boolean v2, p0, Lcn/sharesdk/framework/i;->h:Z
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->setNetworkDevinfo()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private k()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "TencentWeibo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "user id %s ==>>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v4}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "secretType"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "birthday"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "educationJSONArrayStr"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "workJSONArrayStr"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/i;->g()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/i;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcn/sharesdk/framework/ShareSDK;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcn/sharesdk/framework/Platform;->getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Z)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-boolean v2, p0, Lcn/sharesdk/framework/i;->h:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getShortLintk use time: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getShortLintk use time: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/i;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, p2, v2, v3}, Lcn/sharesdk/framework/ShareSDK;->a(Ljava/lang/String;ZILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getShortLintk use time: "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(IILjava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     aput-object p3, v0, v3
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/Platform;ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     new-instance v2, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NullPointerException;);
a=0;//     invoke-virtual {v0, v1, v3, v2}, Lcn/sharesdk/framework/d;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0, v3, p1}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, "Id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/sharesdk/framework/i;->e:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, "SortId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/sharesdk/framework/i;->f:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "Enable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/i;->i:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     instance-of v0, v0, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " failed to parse Enable, this will cause platform always be enable"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/Platform;->initDevInfo(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     instance-of v0, v0, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " failed to parse Id, this will cause method getId() always returens 0"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     instance-of v0, v0, Lcn/sharesdk/framework/CustomPlatform;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " failed to parse SortId, this won\'t cause any problem, don\'t worry"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "true"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/i;->i:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;SLjava/util/HashMap;Ljava/util/HashMap;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "S",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/high16 v0, 0xa0000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/2addr v0, p3
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-object p4, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     aput-object p5, v1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcn/sharesdk/framework/i;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/j;);
a=0;//     invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/j;-><init>(Lcn/sharesdk/framework/i;[Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/j;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/j;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/i;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected b(ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/k;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcn/sharesdk/framework/k;-><init>(Lcn/sharesdk/framework/i;ILjava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/k;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/k;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/d;->a()Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected c(ILjava/lang/Object;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     aget-object v0, p2, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aget-object v0, p2, v7
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p2, v4
a=0;// 
a=0;//     #v4=(Null);
a=0;//     check-cast v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget-object v5, p2, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     check-cast v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/Platform;->doCustomerProtocol(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/HashMap;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v1, v2, v7, v0}, Lcn/sharesdk/framework/d;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     check-cast p2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcn/sharesdk/framework/Platform;->follow(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Null);
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     aget-object v0, p2, v1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v0, p2, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v0, p2, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v3, v0}, Lcn/sharesdk/framework/Platform;->timeline(IILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     move-object p2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v1, p2}, Lcn/sharesdk/framework/Platform;->userInfor(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     check-cast p2, Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v1=(Null);
a=0;//     check-cast p2, Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform$ShareParams;->toMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Integer);v6=(Conflicted);
a=0;//     if-ge v2, v5, :cond_3
a=0;// 
a=0;//     aget-object v6, v4, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_3
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);v6=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0, p2}, Lcn/sharesdk/framework/Platform;->doShare(Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/i;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     aget-object v0, p2, v1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v0, p2, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v0, p2, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v3, v0}, Lcn/sharesdk/framework/Platform;->getFriendList(IILjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_6
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/i;->b(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public d()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->c:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->isValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public e()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/i;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public f()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/i;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()Lcn/sharesdk/framework/PlatformDb;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->c:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public h()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->c:Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->removeAccount()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected i()Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/i;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     return-object v0
a=0;// .end method
}}
