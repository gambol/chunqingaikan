package com.weibo.sdk.android.util; class Utility { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/util/Utility;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Utility.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static decodes:[B
a=0;// 
a=0;// .field private static encodes:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/weibo/sdk/android/util/Utility;->encodes:[C
a=0;// 
a=0;//     .line 32
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/util/Utility;->decodes:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/util/Utility;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static __createNewFile(Ljava/io/File;)Z
a=0;//     .locals 3
a=0;//     .param p0, "file_"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 221
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->makesureParentExist(Ljava/io/File;)V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 226
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->delete(Ljava/io/File;)V
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 232
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->doesExisted(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->deleteDependon(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->makesureFileExist(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static createNewFile(Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p0, "file_"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 210
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->__createNewFile(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " doesn\'t be created!"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static decodeBase62(Ljava/lang/String;)[B
a=0;//     .locals 9
a=0;//     .param p0, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x69
a=0;// 
a=0;//     .line 154
a=0;//     #v6=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,[B);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 158
a=0;//     .local v2, "data":[C
a=0;//     #v2=(Reference,[C);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v0, v7}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "pos":I
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     .local v5, "val":I
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Integer);v5=(Integer);v8=(Conflicted);
a=0;//     array-length v7, v2
a=0;// 
a=0;//     if-lt v3, v7, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v6=(PosByte);
a=0;//     aget-char v1, v2, v3
a=0;// 
a=0;//     .line 162
a=0;//     .local v1, "c":C
a=0;//     #v1=(Char);
a=0;//     if-ne v1, v6, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     aget-char v1, v2, v3
a=0;// 
a=0;//     .line 165
a=0;//     const/16 v7, 0x61
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v1, v7, :cond_3
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 169
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v7=(Integer);
a=0;//     shl-int/lit8 v7, v5, 0x6
a=0;// 
a=0;//     sget-object v8, Lcom/weibo/sdk/android/util/Utility;->decodes:[B
a=0;// 
a=0;//     #v8=(Reference,[B);
a=0;//     aget-byte v8, v8, v1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     or-int v5, v7, v8
a=0;// 
a=0;//     .line 170
a=0;//     add-int/lit8 v4, v4, 0x6
a=0;// 
a=0;//     .line 171
a=0;//     :goto_3
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-gt v4, v7, :cond_6
a=0;// 
a=0;//     .line 160
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 166
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     const/16 v7, 0x62
a=0;// 
a=0;//     if-ne v1, v7, :cond_4
a=0;// 
a=0;//     const/16 v1, 0x2b
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 167
a=0;//     :cond_4
a=0;//     #v1=(Char);
a=0;//     const/16 v7, 0x63
a=0;// 
a=0;//     if-ne v1, v7, :cond_5
a=0;// 
a=0;//     const/16 v1, 0x2f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Char);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     aget-char v1, v2, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 172
a=0;//     :cond_6
a=0;//     #v8=(Byte);
a=0;//     add-int/lit8 v4, v4, -0x8
a=0;// 
a=0;//     shr-int v7, v5, v4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     shl-int/2addr v7, v4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     and-int/2addr v5, v7
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;//     .locals 9
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v5=(Null);
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     .local v2, "params":Landroid/os/Bundle;
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "array":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-lt v4, v6, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     .end local v0    # "array":[Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 48
a=0;//     .restart local v0    # "array":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,[Ljava/lang/String;);v4=(Integer);v6=(Integer);
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "parameter":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     const-string v7, "="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 50
a=0;//     .local v3, "v":[Ljava/lang/String;
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v7, v3, v5
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v7}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aget-object v8, v3, v8
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v8}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static delete(Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p0, "f"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " doesn\'t be deleted!"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static deleteDependon(Ljava/io/File;I)Z
a=0;//     .locals 3
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;//     .param p1, "maxRetryCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 181
a=0;//     .local v1, "retryCount":I
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ge p1, v2, :cond_0
a=0;// 
a=0;//     const/4 p1, 0x5
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "isDeleted":Z
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     if-gt v1, p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 194
a=0;//     :cond_2
a=0;//     return v0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static deleteDependon(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p0, "filepath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/weibo/sdk/android/util/Utility;->deleteDependon(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static deleteDependon(Ljava/lang/String;I)Z
a=0;//     .locals 1
a=0;//     .param p0, "filepath"    # Ljava/lang/String;
a=0;//     .param p1, "maxRetryCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0, p1}, Lcom/weibo/sdk/android/util/Utility;->deleteDependon(Ljava/io/File;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static doesExisted(Ljava/io/File;)Z
a=0;//     .locals 1
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static doesExisted(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p0, "filepath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 259
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/util/Utility;->doesExisted(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encodeBase62([B)Ljava/lang/String;
a=0;//     .locals 10
a=0;//     .param p0, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x69
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0x2f
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v7, 0x2b
a=0;// 
a=0;//     .line 125
a=0;//     #v7=(PosByte);
a=0;//     new-instance v3, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 126
a=0;//     .local v3, "sb":Ljava/lang/StringBuffer;
a=0;//     #v3=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "pos":I
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     .local v4, "val":I
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v4=(Integer);v6=(Conflicted);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     if-lt v1, v5, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     sget-object v5, Lcom/weibo/sdk/android/util/Utility;->encodes:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     rsub-int/lit8 v6, v2, 0x6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shl-int v6, v4, v6
a=0;// 
a=0;//     aget-char v0, v5, v6
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     if-ne v0, v9, :cond_6
a=0;// 
a=0;//     const-string v5, "ia"
a=0;// 
a=0;//     .line 141
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 146
a=0;//     .end local v0    # "c":C
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     shl-int/lit8 v5, v4, 0x8
a=0;// 
a=0;//     aget-byte v6, p0, v1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     and-int/lit16 v6, v6, 0xff
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     or-int v4, v5, v6
a=0;// 
a=0;//     .line 129
a=0;//     add-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     .line 130
a=0;//     :goto_2
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-gt v2, v5, :cond_2
a=0;// 
a=0;//     .line 127
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_2
a=0;//     sget-object v5, Lcom/weibo/sdk/android/util/Utility;->encodes:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     add-int/lit8 v2, v2, -0x6
a=0;// 
a=0;//     shr-int v6, v4, v2
a=0;// 
a=0;//     aget-char v0, v5, v6
a=0;// 
a=0;//     .line 133
a=0;//     .restart local v0    # "c":C
a=0;//     #v0=(Char);
a=0;//     if-ne v0, v9, :cond_3
a=0;// 
a=0;//     const-string v5, "ia"
a=0;// 
a=0;//     .line 132
a=0;//     :goto_3
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     shl-int/2addr v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     and-int/2addr v4, v5
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 134
a=0;//     :cond_3
a=0;//     #v5=(Reference,[C);
a=0;//     if-ne v0, v7, :cond_4
a=0;// 
a=0;//     const-string v5, "ib"
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 135
a=0;//     :cond_4
a=0;//     if-ne v0, v8, :cond_5
a=0;// 
a=0;//     const-string v5, "ic"
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 143
a=0;//     :cond_6
a=0;//     if-ne v0, v7, :cond_7
a=0;// 
a=0;//     const-string v5, "ib"
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_7
a=0;//     if-ne v0, v8, :cond_8
a=0;// 
a=0;//     const-string v5, "ic"
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static encodeParameters(Lcom/weibo/sdk/android/WeiboParameters;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "httpParams"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->isBundleEmpty(Lcom/weibo/sdk/android/WeiboParameters;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "buf":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     .local v1, "j":I
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "loc":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboParameters;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/weibo/sdk/android/WeiboParameters;->getKey(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 92
a=0;//     .local v2, "key":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 93
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 96
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {p0, v2}, Lcom/weibo/sdk/android/WeiboParameters;->getValue(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 100
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 90
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static encodeUrl(Lcom/weibo/sdk/android/WeiboParameters;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "parameters"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     const-string v5, ""
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     .local v4, "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 63
a=0;//     .local v2, "first":Z
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "loc":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboParameters;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v3, v5, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p0, v3}, Lcom/weibo/sdk/android/WeiboParameters;->getKey(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "_key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/weibo/sdk/android/WeiboParameters;->getValue(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 72
a=0;//     .local v1, "_value":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 73
a=0;//     const-string v5, "encodeUrl"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "key:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " \'s value is null"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 63
a=0;//     :goto_3
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 68
a=0;//     .end local v0    # "_key":Ljava/lang/String;
a=0;//     .end local v1    # "_value":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 76
a=0;//     .restart local v0    # "_key":Ljava/lang/String;
a=0;//     .restart local v1    # "_value":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0, v3}, Lcom/weibo/sdk/android/WeiboParameters;->getKey(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p0, v3}, Lcom/weibo/sdk/android/WeiboParameters;->getValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static isBundleEmpty(Lcom/weibo/sdk/android/WeiboParameters;)Z
a=0;//     .locals 1
a=0;//     .param p0, "bundle"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboParameters;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isWifi(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;//     .param p0, "mContext"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 297
a=0;//     #v2=(One);
a=0;//     const-string v3, "connectivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 298
a=0;//     .local v1, "connectivityManager":Landroid/net/ConnectivityManager;
a=0;//     invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 299
a=0;//     .local v0, "activeNetInfo":Landroid/net/NetworkInfo;
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 302
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static makesureFileExist(Ljava/io/File;)V
a=0;//     .locals 1
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 286
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 282
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->makesureParentExist(Ljava/io/File;)V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->createNewFile(Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static makesureFileExist(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "filePath_"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 292
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/util/Utility;->makesureFileExist(Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static makesureParentExist(Ljava/io/File;)V
a=0;//     .locals 2
a=0;//     .param p0, "file_"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 266
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 267
a=0;//     .local v0, "parent":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/util/Utility;->mkdirs(Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static mkdirs(Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p0, "dir_"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "fail to make "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static parseUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;//     .locals 4
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     .local v2, "u":Ljava/net/URL;
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v2}, Ljava/net/URL;->getQuery()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/weibo/sdk/android/util/Utility;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "b":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v2}, Ljava/net/URL;->getRef()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/weibo/sdk/android/util/Utility;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 40
a=0;//     .end local v0    # "b":Landroid/os/Bundle;
a=0;//     .end local v2    # "u":Ljava/net/URL;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "e":Ljava/net/MalformedURLException;
a=0;//     #v1=(Reference,Ljava/net/MalformedURLException;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "text"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "alertBuilder":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
}}
