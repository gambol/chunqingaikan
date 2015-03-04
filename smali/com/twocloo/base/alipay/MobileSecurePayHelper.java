package com.twocloo.base.alipay; class MobileSecurePayHelper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MobileSecurePayHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final TAG:Ljava/lang/String; = "MobileSecurePayHelper"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 320
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/alipay/MobileSecurePayHelper;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getApkInfo(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "archiveFilePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "apkInfo":Landroid/content/pm/PackageInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkNewUpdate(Landroid/content/pm/PackageInfo;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p1, "packageInfo"    # Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 208
a=0;//     .local v2, "url":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->sendCheckNewUpdate(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 210
a=0;//     .local v1, "resp":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "needUpdate"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "true"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     const-string v3, "updateUrl"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 218
a=0;//     .end local v1    # "resp":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 214
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 215
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method closeProgress()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 310
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mProgress:Landroid/app/ProgressDialog;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 312
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public detectMobile_sp()Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->isMobile_spExist()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "isMobile_spExist":Z
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "cacheDir":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/temp.apk"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 59
a=0;//     .local v1, "cachePath":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "alipay_plugin.apk"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v4, v1}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->retrieveApkFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "\u6b63\u5728\u68c0\u6d4b\u5b89\u5168\u652f\u4ed8\u670d\u52a1\u7248\u672c"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v3, v4, v5, v6, v7}, Lcom/twocloo/base/alipay/BaseHelper;->showProgress(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v3, Ljava/lang/Thread;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v4, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;);
a=0;//     invoke-direct {v4, p0, v1}, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 81
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 85
a=0;//     .end local v0    # "cacheDir":Ljava/io/File;
a=0;//     .end local v1    # "cachePath":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public isMobile_spExist()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "manager":Landroid/content/pm/PackageManager;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 134
a=0;//     .local v3, "pkgList":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v0, v5, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 137
a=0;//     .local v2, "pI":Landroid/content/pm/PackageInfo;
a=0;//     iget-object v5, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "com.alipay.android.app"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v5, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "com.eg.android.AlipayGphone"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     iget v5, v2, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x25
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-lt v5, v6, :cond_2
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     #v4=(Null);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public retrieveApkFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "fileName"    # Ljava/lang/String;
a=0;//     .param p3, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "bRet":Z
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v7, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 162
a=0;//     .local v5, "is":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 163
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 166
a=0;//     .local v3, "fos":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v7, 0x400
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     new-array v6, v7, [B
a=0;// 
a=0;//     .line 167
a=0;//     .local v6, "temp":[B
a=0;//     #v6=(Reference,[B);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 168
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 181
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     .end local v3    # "fos":Ljava/io/FileOutputStream;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "is":Ljava/io/InputStream;
a=0;//     .end local v6    # "temp":[B
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 169
a=0;//     .restart local v2    # "file":Ljava/io/File;
a=0;//     .restart local v3    # "fos":Ljava/io/FileOutputStream;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v5    # "is":Ljava/io/InputStream;
a=0;//     .restart local v6    # "temp":[B
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Reference,Ljava/io/File;);v3=(Reference,Ljava/io/FileOutputStream;);v4=(Integer);v5=(Reference,Ljava/io/InputStream;);v6=(Reference,[B);v7=(PosShort);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v3, v6, v7, v4}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 177
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     .end local v3    # "fos":Ljava/io/FileOutputStream;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "is":Ljava/io/InputStream;
a=0;//     .end local v6    # "temp":[B
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public retrieveApkFromNet(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "strurl"    # Ljava/lang/String;
a=0;//     .param p3, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     .local v0, "bRet":Z
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Lcom/twocloo/base/alipay/NetworkManager;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/alipay/NetworkManager;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Lcom/twocloo/base/alipay/NetworkManager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 296
a=0;//     .local v2, "nM":Lcom/twocloo/base/alipay/NetworkManager;
a=0;//     #v2=(Reference,Lcom/twocloo/base/alipay/NetworkManager;);
a=0;//     invoke-virtual {v2, p1, p2, p3}, Lcom/twocloo/base/alipay/NetworkManager;->urlDownloadToFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 301
a=0;//     .end local v2    # "nM":Lcom/twocloo/base/alipay/NetworkManager;
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 297
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 298
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendCheckNewUpdate(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 6
a=0;//     .param p1, "versionName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     .local v2, "objResp":Lorg/json/JSONObject;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     .local v3, "req":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "action"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "update"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "data":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "platform"
a=0;// 
a=0;//     const-string v5, "android"
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 236
a=0;//     const-string v4, "version"
a=0;// 
a=0;//     invoke-virtual {v0, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 237
a=0;//     const-string v4, "partner"
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 239
a=0;//     const-string v4, "data"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->sendRequest(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 246
a=0;//     .end local v0    # "data":Lorg/json/JSONObject;
a=0;//     .end local v3    # "req":Lorg/json/JSONObject;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lorg/json/JSONObject;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 242
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 243
a=0;//     .local v1, "e":Lorg/json/JSONException;
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendRequest(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 7
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     new-instance v3, Lcom/twocloo/base/alipay/NetworkManager;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/alipay/NetworkManager;);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v5}, Lcom/twocloo/base/alipay/NetworkManager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 259
a=0;//     .local v3, "nM":Lcom/twocloo/base/alipay/NetworkManager;
a=0;//     #v3=(Reference,Lcom/twocloo/base/alipay/NetworkManager;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     .local v1, "jsonResponse":Lorg/json/JSONObject;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     .local v4, "response":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     monitor-enter v3
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 265
a=0;//     :try_start_1
a=0;//     const-string v5, "https://msp.alipay.com/x.htm"
a=0;// 
a=0;//     invoke-virtual {v3, p1, v5}, Lcom/twocloo/base/alipay/NetworkManager;->SendAndWaitResponse(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 263
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_2
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .end local v1    # "jsonResponse":Lorg/json/JSONObject;
a=0;//     .local v2, "jsonResponse":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 274
a=0;//     .end local v2    # "jsonResponse":Lorg/json/JSONObject;
a=0;//     .restart local v1    # "jsonResponse":Lorg/json/JSONObject;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lorg/json/JSONObject;);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 275
a=0;//     const-string v5, "MobileSecurePayHelper"
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/base/alipay/BaseHelper;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 263
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v6=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v5
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     .line 269
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 270
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showInstallConfirmDialog(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "cachePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     sget v1, Lcom/twocloo/base/R$drawable;->info:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 99
a=0;//     const-string v1, "\u5b89\u88c5\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 100
a=0;//     const-string v1, "\u4e3a\u4fdd\u8bc1\u60a8\u7684\u4ea4\u6613\u5b89\u5168\uff0c\u9700\u8981\u60a8\u5b89\u88c5\u652f\u4ed8\u5b9d\u5b89\u5168\u652f\u4ed8\u670d\u52a1\uff0c\u624d\u80fd\u8fdb\u884c\u4ed8\u6b3e\u3002\n\n\u70b9\u51fb\u786e\u5b9a\uff0c\u7acb\u5373\u5b89\u88c5\u3002"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 102
a=0;//     const-string v1, "\u786e\u5b9a"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;);
a=0;//     invoke-direct {v2, p0, p2, p1}, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 118
a=0;//     const-string v1, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/base/alipay/MobileSecurePayHelper$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayHelper$4;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/base/alipay/MobileSecurePayHelper$4;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$4;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
}}
