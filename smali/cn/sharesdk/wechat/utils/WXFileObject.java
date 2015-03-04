package cn.sharesdk.wechat.utils; class WXFileObject { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/WXFileObject;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public fileData:[B
a=0;// 
a=0;// .field public filePath:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "checkArgs fail, both arguments is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0xa00000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v1, v2, :cond_3
a=0;// 
a=0;//     const-string v1, "checkArgs fail, fileData is too large"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/32 v3, 0xa00000
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     const-string v1, "checkArgs fail, fileSize is too large"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public serialize(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "_wxfileobject_fileData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     const-string v0, "_wxfileobject_filePath"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFileData([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFilePath(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public type()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public unserialize(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "_wxfileobject_fileData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->fileData:[B
a=0;// 
a=0;//     const-string v0, "_wxfileobject_filePath"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
