package com.tencent.weiyun; class FileManager$DownLoadImp { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/weiyun/FileManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DownLoadImp"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DOWNLOAD_COOKIE_NAME:Ljava/lang/String; = "dl_cookie_name"
a=0;// 
a=0;// .field private static final DOWNLOAD_COOKIE_VALUE:Ljava/lang/String; = "dl_cookie_value"
a=0;// 
a=0;// .field private static final DOWNLOAD_ENCRYPT_URL:Ljava/lang/String; = "dl_encrypt_url"
a=0;// 
a=0;// .field private static final DOWNLOAD_MUSIC_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/download_music"
a=0;// 
a=0;// .field private static final DOWNLOAD_PIC_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/download_photo"
a=0;// 
a=0;// .field private static final DOWNLOAD_PROGRESS:I = 0x1
a=0;// 
a=0;// .field private static final DOWNLOAD_PROGRESS_DONE:I = 0x2
a=0;// 
a=0;// .field private static final DOWNLOAD_SERVER_HOST:Ljava/lang/String; = "dl_svr_host"
a=0;// 
a=0;// .field private static final DOWNLOAD_SERVER_PORT:Ljava/lang/String; = "dl_svr_port"
a=0;// 
a=0;// .field private static final DOWNLOAD_THUMB_SIZE:Ljava/lang/String; = "dl_thumb_size"
a=0;// 
a=0;// .field private static final DOWNLOAD_THUMB_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/get_photo_thumb"
a=0;// 
a=0;// .field private static final DOWNLOAD_VIDEO_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/download_video"
a=0;// 
a=0;// .field private static final GET_PERMISSON_DOWN:I = 0x0
a=0;// 
a=0;// .field private static final MAX_ERROR_TIMES:I = 0xa
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCallback:Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDownloadCookieName:Ljava/lang/String;
a=0;// 
a=0;// .field private mDownloadCookieValue:Ljava/lang/String;
a=0;// 
a=0;// .field private mDownloadEncryptUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private mDownloadServerHost:Ljava/lang/String;
a=0;// 
a=0;// .field private mDownloadServerPort:I
a=0;// 
a=0;// .field private mDownloadThumbSize:Ljava/lang/String;
a=0;// 
a=0;// .field private mFile:Ljava/io/File;
a=0;// 
a=0;// .field private mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mSavePath:Ljava/lang/String;
a=0;// 
a=0;// .field private mThumbSize:Ljava/lang/String;
a=0;// 
a=0;// .field private mWeiyunFile:Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 530
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iput-object p2, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 531
a=0;//     iput-object p3, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     .line 532
a=0;//     iput-object p4, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mWeiyunFile:Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     .line 533
a=0;//     iput-object p5, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mSavePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 534
a=0;//     iput-object p6, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mCallback:Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     .line 535
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$DownLoadImp$1;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;-><init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;Landroid/os/Looper;Lcom/tencent/weiyun/FileManager;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 576
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mCallback:Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IDownLoadFileCallBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadEncryptUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1602(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadEncryptUrl:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1700(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadCookieName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1702(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadCookieName:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1800(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadCookieValue:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1802(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadCookieValue:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1900(Lcom/tencent/weiyun/FileManager$DownLoadImp;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadServerPort:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1902(Lcom/tencent/weiyun/FileManager$DownLoadImp;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadServerPort:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2000(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadServerHost:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2002(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadServerHost:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadThumbSize:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2102(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mDownloadThumbSize:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2200(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     invoke-direct {p0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->doDownload()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2300(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mSavePath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mWeiyunFile:Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/WeiyunFile;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mThumbSize:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2800(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2900(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3000(Lcom/tencent/weiyun/FileManager$DownLoadImp;Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->getDownloadUrl(Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private doDownload()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$DownLoadImp$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;-><init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$3;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->start()V
a=0;// 
a=0;//     .line 813
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getDownloadPermission()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 624
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$DownLoadImp$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;-><init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$2;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->start()V
a=0;// 
a=0;//     .line 666
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getDownloadUrl(Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mThumbSize:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 608
a=0;//     const-string v0, "https://graph.qq.com/weiyun/get_photo_thumb"
a=0;// 
a=0;//     .line 618
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 610
a=0;//     :cond_0
a=0;//     const-string v0, "https://graph.qq.com/weiyun/download_photo"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 612
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->MusicFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 613
a=0;//     const-string v0, "https://graph.qq.com/weiyun/download_music"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 614
a=0;//     :cond_2
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->VideoFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     if-ne p1, v0, :cond_3
a=0;// 
a=0;//     .line 615
a=0;//     const-string v0, "https://graph.qq.com/weiyun/download_video"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 618
a=0;//     :cond_3
a=0;//     const-string v0, "https://graph.qq.com/weiyun/download_photo"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setThumbSize(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 579
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mThumbSize:Ljava/lang/String;
a=0;// 
a=0;//     .line 580
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 583
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mSavePath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mWeiyunFile:Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mWeiyunFile:Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/WeiyunFile;->getFileId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 585
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 586
a=0;//     const/4 v1, -0x5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 587
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 603
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 592
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mSavePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mFile:Ljava/io/File;
a=0;// 
a=0;//     .line 593
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mFile:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 594
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 595
a=0;//     const/16 v1, -0xb
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 596
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 601
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->mCallback:Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IDownLoadFileCallBack;);
a=0;//     invoke-interface {v0}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onPrepareStart()V
a=0;// 
a=0;//     .line 602
a=0;//     invoke-direct {p0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->getDownloadPermission()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
