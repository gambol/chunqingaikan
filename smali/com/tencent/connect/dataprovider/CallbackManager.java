package com.tencent.connect.dataprovider; class CallbackManager { void a() { int a;
a=0;// .class public final Lcom/tencent/connect/dataprovider/CallbackManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/content/Context;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private b:Landroid/net/Uri;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/CallbackManager;);
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 32
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->b:Landroid/net/Uri;
a=0;// 
a=0;//     .line 34
a=0;//     const-string v1, "srcPackageName"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const-string v1, "srcClassName"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     const-string v1, "srcAction"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "requestDataTypeFlag"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->h:I
a=0;// 
a=0;//     .line 38
a=0;//     const-string v1, "params_appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->b:Landroid/net/Uri;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/os/Bundle;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 56
a=0;//     const-string v0, "params_appid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 58
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 128
a=0;//     const/4 v0, -0x7
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "http://"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 139
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 145
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 147
a=0;//     const/4 v0, -0x5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Boolean);
a=0;//     const/16 v0, -0xa
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 152
a=0;//     :cond_4
a=0;//     const/4 v0, -0x8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 156
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 157
a=0;//     const/16 v0, -0x9
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_6
a=0;//     #v0=(Null);
a=0;//     const-wide/32 v3, 0x40000000
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v0, -0x6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getRequestDateTypeFlag()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCallFromTencentApp()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSupportType(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/dataprovider/CallbackManager;->getRequestDateTypeFlag()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendTextAndImagePath(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 78
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v3}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     #v0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "contentDataType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 90
a=0;//     const-string v2, "contentData"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendTextAndVideoPath(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 96
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 101
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     #v0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "contentDataType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 108
a=0;//     const-string v2, "contentData"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendTextOnly(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     .line 114
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/dataprovider/DataType$TextOnly;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/connect/dataprovider/DataType$TextOnly;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextOnly;);
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 120
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "contentDataType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 121
a=0;//     const-string v2, "contentData"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
