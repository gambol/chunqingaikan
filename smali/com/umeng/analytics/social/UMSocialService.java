package com.umeng.analytics.social; class UMSocialService { void a() { int a;
a=0;// .class public abstract Lcom/umeng/analytics/social/UMSocialService;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UMSocialService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/umeng/analytics/social/UMSocialService$a;,
a=0;//         Lcom/umeng/analytics/social/UMSocialService$b;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/social/UMSocialService;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs a(Landroid/content/Context;Lcom/umeng/analytics/social/UMSocialService$b;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Null);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     :try_start_0
a=0;//     array-length v1, p3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p0, p2, p3}, Lcom/umeng/analytics/social/f;->a(Landroid/content/Context;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/umeng/analytics/social/UMSocialService$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/analytics/social/UMSocialService$a;);
a=0;//     invoke-direct {v1, v0, p1, p3}, Lcom/umeng/analytics/social/UMSocialService$a;-><init>([Ljava/lang/String;Lcom/umeng/analytics/social/UMSocialService$b;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/social/UMSocialService$a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Void;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v1, v0}, Lcom/umeng/analytics/social/UMSocialService$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 59
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 45
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     aget-object v2, p3, v0
a=0;// 
a=0;//     .line 46
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Lcom/umeng/analytics/social/UMPlatformData;->isValid()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcom/umeng/analytics/social/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v1, "parameter is not valid."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/umeng/analytics/social/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Lcom/umeng/analytics/social/a; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 54
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 55
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "unable send event."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 45
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static varargs share(Landroid/content/Context;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, p1, p2}, Lcom/umeng/analytics/social/UMSocialService;->a(Landroid/content/Context;Lcom/umeng/analytics/social/UMSocialService$b;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs share(Landroid/content/Context;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, v0, p1}, Lcom/umeng/analytics/social/UMSocialService;->a(Landroid/content/Context;Lcom/umeng/analytics/social/UMSocialService$b;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
}}
