package com.twocloo.com.cn.http; class MyAutoUpdate { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MyAutoUpdate.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private content:Ljava/lang/String;
a=0;// 
a=0;// .field private dLock:Z
a=0;// 
a=0;// .field private isforce:Z
a=0;// 
a=0;// .field private nowversionCode:I
a=0;// 
a=0;// .field private strURL:Ljava/lang/String;
a=0;// 
a=0;// .field private toast:Z
a=0;// 
a=0;// .field private versionCode:I
a=0;// 
a=0;// .field private wrongversion:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Z[I)V
a=0;//     .locals 8
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "nowversionCode"    # I
a=0;//     .param p3, "url"    # Ljava/lang/String;
a=0;//     .param p4, "content"    # Ljava/lang/String;
a=0;//     .param p5, "isforce"    # Z
a=0;//     .param p6, "wrongversion"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v7, p6
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/http/MyAutoUpdate;-><init>(Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;Z[I)V
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);p0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;Z[I)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "nowversionCode"    # I
a=0;//     .param p3, "url"    # Ljava/lang/String;
a=0;//     .param p4, "toast"    # Z
a=0;//     .param p5, "content"    # Ljava/lang/String;
a=0;//     .param p6, "isforce"    # Z
a=0;//     .param p7, "wrongversion"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 42
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->nowversionCode:I
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->strURL:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     iput-boolean p4, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->toast:Z
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->content:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     iput-boolean p6, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->isforce:Z
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->wrongversion:[I
a=0;// 
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->getCurrentVersion()V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->strURL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->dLock:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/http/MyAutoUpdate;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->dLock:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private forceshowUpdateDialog()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 141
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u53d1\u73b0\u65b0\u7248\u672c"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->content:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 145
a=0;//     const-string v1, "\u73b0\u5728\u5347\u7ea7"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$5;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$5;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 191
a=0;//     const-string v1, "\u9000\u51fa"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$6;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$6;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$6;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$6;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 208
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getCurrentVersion()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Landroid/app/Activity;);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 96
a=0;//     .local v1, "info":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->versionCode:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     .end local v1    # "info":Landroid/content/pm/PackageInfo;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private iswrongversion([II)Z
a=0;//     .locals 2
a=0;//     .param p1, "a"    # [I
a=0;//     .param p2, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 80
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     aget v1, p1, v0
a=0;// 
a=0;//     if-ne v1, p2, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private showSingleUpdateDialog()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->content:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u73b0\u5728\u5347\u7ea7"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$3;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$3;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 130
a=0;//     const-string v1, "\u4ee5\u540e\u518d\u8bf4"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$4;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$4;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$4;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showUpdateDialog()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u53d1\u73b0\u65b0\u7248\u672c"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->content:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u73b0\u5728\u5347\u7ea7"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$1;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 112
a=0;//     const-string v1, "\u4ee5\u540e\u518d\u8bf4"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$2;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$2;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public check()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->isforce:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->forceshowUpdateDialog()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->wrongversion:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->versionCode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->iswrongversion([II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->forceshowUpdateDialog()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->nowversionCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->versionCode:I
a=0;// 
a=0;//     if-le v0, v1, :cond_5
a=0;// 
a=0;//     .line 65
a=0;//     const-string v0, "single"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->showSingleUpdateDialog()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_4
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->showUpdateDialog()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->toast:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u5f53\u524d\u5df2\u662f\u6700\u65b0\u7248\u672c \u4e0d\u9700\u8981\u66f4\u65b0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
