package com.tencent.weiyun; class FileManager$UploadFileImp { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$UploadFileImp;
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
a=0;//     name = "UploadFileImp"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final GET_PERMISSON_DONE:I = 0x0
a=0;// 
a=0;// .field private static final UPLOAD_IMAGE_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_photo"
a=0;// 
a=0;// .field private static final UPLOAD_MUSIC_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_music"
a=0;// 
a=0;// .field private static final UPLOAD_PROGRESS:I = 0x1
a=0;// 
a=0;// .field private static final UPLOAD_PROGRESS_DONE:I = 0x2
a=0;// 
a=0;// .field private static final UPLOAD_VIDEO_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_video"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCallback:Lcom/tencent/weiyun/IUploadFileCallBack;
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mFileKey:Ljava/lang/String;
a=0;// 
a=0;// .field private final mFilePath:Ljava/lang/String;
a=0;// 
a=0;// .field private mFileSize:J
a=0;// 
a=0;// .field private final mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHost:Ljava/lang/String;
a=0;// 
a=0;// .field private mMD5Hash:Ljava/lang/String;
a=0;// 
a=0;// .field private mUKey:[B
a=0;// 
a=0;// .field final synthetic this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/weiyun/IUploadFileCallBack;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 181
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     iput-object p2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 182
a=0;//     iput-object p3, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     .line 183
a=0;//     iput-object p4, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 184
a=0;//     iput-object p5, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/weiyun/IUploadFileCallBack;
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$UploadFileImp$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$UploadFileImp$1;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/weiyun/FileManager$UploadFileImp$1;-><init>(Lcom/tencent/weiyun/FileManager$UploadFileImp;Landroid/os/Looper;Lcom/tencent/weiyun/FileManager;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Lcom/tencent/weiyun/IUploadFileCallBack;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/weiyun/IUploadFileCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IUploadFileCallBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$102(Lcom/tencent/weiyun/FileManager$UploadFileImp;[B)[B
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mUKey:[B
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileType:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1200(Lcom/tencent/weiyun/FileManager$UploadFileImp;Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->getRequestUrl(Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1400(Lcom/tencent/weiyun/FileManager$UploadFileImp;[BII)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->packPostBody([BII)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHost:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$202(Lcom/tencent/weiyun/FileManager$UploadFileImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHost:Ljava/lang/String;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->doUpload()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Lcom/tencent/weiyun/FileManager$UploadFileImp;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-wide v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileSize:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private doUpload()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$UploadFileImp$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;-><init>(Lcom/tencent/weiyun/FileManager$UploadFileImp;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp$3;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->start()V
a=0;// 
a=0;//     .line 453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getRequestUrl(Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     const-string v0, "https://graph.qq.com/weiyun/upload_photo"
a=0;// 
a=0;//     .line 293
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->MusicFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     const-string v0, "https://graph.qq.com/weiyun/upload_music"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 293
a=0;//     :cond_1
a=0;//     const-string v0, "https://graph.qq.com/weiyun/upload_video"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getUploadPermission()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$UploadFileImp$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$UploadFileImp$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/weiyun/FileManager$UploadFileImp$2;-><init>(Lcom/tencent/weiyun/FileManager$UploadFileImp;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp$2;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp$2;->start()V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private packPostBody([BII)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 459
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 460
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1, p2}, Ljava/security/MessageDigest;->update([BII)V
a=0;// 
a=0;//     .line 461
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1}, Lcom/tencent/utils/DataConvert;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;
a=0;// 
a=0;//     .line 462
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 471
a=0;//     add-int/lit16 v1, p2, 0x154
a=0;// 
a=0;//     .line 472
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 473
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 476
a=0;//     #v0=(Reference,[B);
a=0;//     const v2, -0x5432678a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v0, v4}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 477
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v3, v0, v2}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     .line 478
a=0;//     invoke-static {v4, v0, v2}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     .line 479
a=0;//     invoke-static {v1, v0, v2}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 482
a=0;//     const/16 v2, 0x130
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v2, v0, v1}, Lcom/tencent/utils/DataConvert;->putShort2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mUKey:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2, v0, v1}, Lcom/tencent/utils/DataConvert;->putBytes2Bytes([B[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 484
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2, v0, v1}, Lcom/tencent/utils/DataConvert;->putShort2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0, v1}, Lcom/tencent/utils/DataConvert;->putString2Bytes(Ljava/lang/String;[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 486
a=0;//     iget-wide v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileSize:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v0, v1}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 487
a=0;//     invoke-static {p3, v0, v1}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 488
a=0;//     invoke-static {p2, v0, v1}, Lcom/tencent/utils/DataConvert;->putInt2Bytes(I[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 491
a=0;//     invoke-static {p1, p2, v0, v1}, Lcom/tencent/utils/DataConvert;->putBytes2Bytes([BI[BI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 493
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 463
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 464
a=0;//     #v0=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 465
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 466
a=0;//     invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 468
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public start()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     .line 224
a=0;//     #v6=(Byte);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 226
a=0;//     const/4 v1, -0x5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 227
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
a=0;//     .line 228
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 285
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/weiyun/IUploadFileCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/IUploadFileCallBack;);
a=0;//     invoke-interface {v0}, Lcom/tencent/weiyun/IUploadFileCallBack;->onPrepareStart()V
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 234
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileSize:J
a=0;// 
a=0;//     .line 239
a=0;//     const/high16 v1, 0x80000
a=0;// 
a=0;//     .line 242
a=0;//     :try_start_0
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "SHA-1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 243
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 244
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v4, Ljava/security/DigestInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/security/DigestInputStream;);
a=0;//     invoke-direct {v4, v3, v2}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V
a=0;// 
a=0;//     .line 245
a=0;//     #v4=(Reference,Ljava/security/DigestInputStream;);
a=0;//     new-array v2, v1, [B
a=0;// 
a=0;//     .line 246
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v4, v2}, Ljava/security/DigestInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gtz v5, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {v4}, Ljava/security/DigestInputStream;->getMessageDigest()Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 249
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-static {v5}, Lcom/tencent/utils/DataConvert;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 250
a=0;//     invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 265
a=0;//     :try_start_1
a=0;//     const-string v2, "MD5"
a=0;// 
a=0;//     invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 267
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v0, Ljava/security/DigestInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/security/DigestInputStream;);
a=0;//     invoke-direct {v0, v3, v2}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V
a=0;// 
a=0;//     .line 268
a=0;//     #v0=(Reference,Ljava/security/DigestInputStream;);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     #v1=(Reference,[B);v2=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/security/DigestInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_3
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v0}, Ljava/security/DigestInputStream;->getMessageDigest()Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/tencent/utils/DataConvert;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;
a=0;// 
a=0;//     .line 273
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v0}, Ljava/security/DigestInputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 284
a=0;//     invoke-direct {p0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->getUploadPermission()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :catch_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 255
a=0;//     iput v6, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 256
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
a=0;//     .line 257
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/security/DigestInputStream;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 278
a=0;//     iput v6, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 279
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
a=0;//     .line 280
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
