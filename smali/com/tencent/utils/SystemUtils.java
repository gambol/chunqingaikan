package com.tencent.utils; class SystemUtils { void a() { int a;
a=0;// .class public Lcom/tencent/utils/SystemUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final QQ_SHARE_CALLBACK_ACTION:Ljava/lang/String; = "shareToQQ"
a=0;// 
a=0;// .field public static final QQ_VERSION_NAME_4_1_0:Ljava/lang/String; = "4.1.0"
a=0;// 
a=0;// .field public static final QQ_VERSION_NAME_4_2_0:Ljava/lang/String; = "4.2.0"
a=0;// 
a=0;// .field public static final QQ_VERSION_NAME_4_3_0:Ljava/lang/String; = "4.3.0"
a=0;// 
a=0;// .field public static final QQ_VERSION_NAME_4_5_0:Ljava/lang/String; = "4.5.0"
a=0;// 
a=0;// .field public static final QQ_VERSION_NAME_4_6_0:Ljava/lang/String; = "4.6.0"
a=0;// 
a=0;// .field public static final QZONE_SHARE_CALLBACK_ACTION:Ljava/lang/String; = "shareToQzone"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/SystemUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static checkMobileQQ(Landroid/content/Context;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 210
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 211
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 213
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     const-string v4, "com.tencent.mobileqq"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     .line 222
a=0;//     :try_start_1
a=0;//     const-string v3, "MobileQQ verson"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 223
a=0;//     const-string v3, "\\."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, v2, v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 225
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v2, v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(Integer);
a=0;//     if-gt v3, v6, :cond_0
a=0;// 
a=0;//     if-ne v3, v6, :cond_1
a=0;// 
a=0;//     if-lt v2, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 214
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(One);v2=(Reference,Landroid/content/pm/PackageManager;);v3=(Null);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 215
a=0;//     const-string v4, "checkMobileQQ"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "error"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :catch_1
a=0;//     #v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     const-string v0, "com.tencent.mobileqq"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     invoke-static {v0, p1}, Lcom/tencent/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 63
a=0;//     #v2=(Byte);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_3
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     const-string v3, "\\."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 72
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const-string v3, "\\."
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 75
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v3=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     array-length v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v3, v6, :cond_6
a=0;// 
a=0;//     array-length v6, v5
a=0;// 
a=0;//     if-ge v3, v6, :cond_6
a=0;// 
a=0;//     .line 76
a=0;//     aget-object v6, v4, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 77
a=0;//     #v6=(Integer);
a=0;//     aget-object v7, v5, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 78
a=0;//     #v7=(Integer);
a=0;//     if-ge v6, v7, :cond_4
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_4
a=0;//     #v0=(Null);
a=0;//     if-le v6, v7, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 84
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v4, v3, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     :cond_7
a=0;//     #v0=(Null);
a=0;//     array-length v1, v5
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(One);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppName(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     #v0=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppSignatureMD5(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, getSignValidString"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v2, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     .line 140
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v2, v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Landroid/content/pm/Signature;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v3, v2}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/utils/Util;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {v3}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     .line 145
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 147
a=0;//     invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3}, Ljava/security/MessageDigest;->reset()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 149
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v5
a=0;// 
a=0;//     .line 150
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 151
a=0;//     const-string v2, "openSDK_LOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "OpenUi, getSignValidString error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     :catch_1
a=0;//     #v4=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 48
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRealPathFromUri(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v2, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "_data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v2, v0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     .line 179
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/app/Activity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 180
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "_data"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 182
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 183
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public static isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 167
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 172
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 173
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isAppSignatureValid(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Null);
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "OpenUi, validateAppSignatureForPackage"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v2=(Reference,[Landroid/content/pm/Signature;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     .line 115
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,[Landroid/content/pm/Signature;);v3=(Integer);v4=(Boolean);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
