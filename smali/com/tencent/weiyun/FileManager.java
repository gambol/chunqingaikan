package com.tencent.weiyun; class FileManager { void a() { int a;
a=0;// .class public Lcom/tencent/weiyun/FileManager;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/weiyun/FileManager$DownLoadImp;,
a=0;//         Lcom/tencent/weiyun/FileManager$UploadFileImp;,
a=0;//         Lcom/tencent/weiyun/FileManager$GetFileListListener;,
a=0;//         Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:[Ljava/lang/String;
a=0;// 
a=0;// .field private static final b:[Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Null);
a=0;//     new-array v0, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const-string v1, "https://graph.qq.com/weiyun/get_photo_list"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     const-string v1, "https://graph.qq.com/weiyun/get_music_list"
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-string v1, "https://graph.qq.com/weiyun/get_video_list"
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager;->a:[Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     new-array v0, v5, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "https://graph.qq.com/weiyun/delete_photo"
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     const-string v1, "https://graph.qq.com/weiyun/delete_music"
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-string v1, "https://graph.qq.com/weiyun/delete_video"
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/weiyun/FileManager;->b:[Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 85
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 89
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/weiyun/FileManager;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/FileManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/weiyun/FileManager;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/weiyun/FileManager;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/FileManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/weiyun/FileManager;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public deleteFile(Lcom/tencent/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager;->b:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->value()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v2, v0, v1
a=0;// 
a=0;//     .line 141
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/FileManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 142
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "file_id"
a=0;// 
a=0;//     invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p3}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 144
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public downLoadFile(Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/weiyun/WeiyunFile;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/IDownLoadFileCallBack;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/weiyun/FileManager$DownLoadImp;-><init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->start()V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public downLoadThumb(Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget-object v3, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/weiyun/WeiyunFile;);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/IDownLoadFileCallBack;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/weiyun/FileManager$DownLoadImp;-><init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-virtual {v0, p3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->setThumbSize(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->start()V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getFileList(Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/IGetFileListListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     sget-object v0, Lcom/tencent/weiyun/FileManager;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/weiyun/FileManager$WeiyunFileType;->value()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v2, v0, v1
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/FileManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 132
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "offset"
a=0;// 
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     const-string v0, "number"
a=0;// 
a=0;//     const-string v1, "100"
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$GetFileListListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$GetFileListListener;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/tencent/weiyun/FileManager$GetFileListListener;-><init>(Lcom/tencent/weiyun/FileManager;Lcom/tencent/weiyun/IGetFileListListener;)V
a=0;// 
a=0;//     .line 135
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$GetFileListListener;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 136
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uploadFile(Lcom/tencent/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/weiyun/IUploadFileCallBack;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     new-instance v0, Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/weiyun/FileManager$WeiyunFileType;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/weiyun/IUploadFileCallBack;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/weiyun/FileManager$UploadFileImp;-><init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/weiyun/IUploadFileCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->start()V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
}}
