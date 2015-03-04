package com.twocloooo; class DevInit { void a() { int a;
a=0;// .class public final Lcom/twocloooo/DevInit;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static a:Ljava/lang/String;
a=0;// 
a=0;// .field static b:Ljava/lang/String;
a=0;// 
a=0;// .field static c:J
a=0;// 
a=0;// .field static d:J
a=0;// 
a=0;// .field static e:Ljava/lang/Class;
a=0;// 
a=0;// .field static f:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "\u8bf7\u5728AndroidMenifest.xml\u4e2d\u58f0\u660e\u81ea\u5b9a\u4e49\u7684activity\u548cservice"
a=0;// 
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/twocloooo/DevInit;->c:J
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloooo/DevInit;->d:J
a=0;// 
a=0;//     const-class v0, Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->e:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v0, Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->f:Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/DevInit;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/DevInit;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/DevInit;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/bb;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     sget-object v2, Lcom/twocloooo/bf;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     sget-object v1, Lcom/twocloooo/bf;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u672a\u8bbe\u7f6econtext\uff0c\u8bf7\u53c2\u770b\u6587\u6863"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u672a\u8bbe\u7f6eapp-id\uff0c\u8bf7\u53c2\u770b\u6587\u6863"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/twocloooo/bb;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p0, p2}, Lcom/twocloooo/DevInit;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {p0, v0}, Lcom/twocloooo/bb;->c(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/twocloooo/af;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getOnlineParams(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " You must set an usable key name"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/twocloooo/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {p0, p1, p2}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getOnlineParams(Landroid/content/Context;Ljava/lang/String;Lcom/twocloooo/GetOnlineParamsListener;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " You must set an usable key name"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-virtual {v0, p0, p1, p2, p3}, Lcom/twocloooo/af;->a(Landroid/content/Context;Ljava/lang/String;Lcom/twocloooo/GetOnlineParamsListener;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {p0, p1, p3}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/GetOnlineParamsListener;->onParamsReturn(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTotalMoney(Landroid/content/Context;Lcom/twocloooo/GetTotalMoneyListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-virtual {v0, p0, p1}, Lcom/twocloooo/af;->a(Landroid/content/Context;Lcom/twocloooo/GetTotalMoneyListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/twocloooo/GetTotalMoneyListener;->getTotalMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static giveMoney(Landroid/content/Context;ILcom/twocloooo/GiveMoneyListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     if-gtz p1, :cond_1
a=0;// 
a=0;//     const-string v0, "the number can not <= 0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/GiveMoneyListener;->giveMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/twocloooo/af;->a(Landroid/content/Context;ILcom/twocloooo/GiveMoneyListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/GiveMoneyListener;->giveMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static initGoogleContext(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/bf;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloooo/DevInit;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initGoogleContext(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1, p2}, Lcom/twocloooo/DevInit;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initGoogleContext(Landroid/app/Service;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/bf;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloooo/DevInit;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static initGoogleContext(Landroid/app/Service;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1, p2}, Lcom/twocloooo/DevInit;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setCurrentUserID(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/bb;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, p1}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setCustomActivity(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevInit;->f:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Lcom/twocloooo/DevInit;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->f:Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setCustomService(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevInit;->e:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Lcom/twocloooo/DevInit;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloooo/DevInit;->e:Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setTotalMoney(Landroid/content/Context;ILcom/twocloooo/SetTotalMoneyListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     const-string v0, "the number can not < 0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/SetTotalMoneyListener;->setTotalMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/twocloooo/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/d;);
a=0;//     invoke-direct {v0, p1, p0, p2}, Lcom/twocloooo/d;-><init>(ILandroid/content/Context;Lcom/twocloooo/SetTotalMoneyListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/d;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloooo/DevInit;->getTotalMoney(Landroid/content/Context;Lcom/twocloooo/GetTotalMoneyListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/SetTotalMoneyListener;->setTotalMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static showOffers(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "SD\u5361\u4e0d\u53ef\u7528"
a=0;// 
a=0;//     const/16 v1, 0xbb8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lcom/twocloooo/DevInit;->f:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     instance-of v1, p0, Landroid/app/Service;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static spendMoney(Landroid/content/Context;ILcom/twocloooo/SpendMoneyListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     if-gtz p1, :cond_1
a=0;// 
a=0;//     const-string v0, "the number can not <= 0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/SpendMoneyListener;->spendMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloooo/af;->a()Lcom/twocloooo/af;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/twocloooo/af;->a(Landroid/content/Context;ILcom/twocloooo/SpendMoneyListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Lcom/twocloooo/SpendMoneyListener;->spendMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
