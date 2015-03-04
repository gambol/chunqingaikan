package com.twocloo.com.cn.common; class Base64 { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/Base64;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Base64.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final legalChars:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/Base64;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static decode(C)I
a=0;//     .locals 3
a=0;//     .param p0, "c"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/16 v0, 0x41
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p0, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x5a
a=0;// 
a=0;//     if-gt p0, v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     add-int/lit8 v0, p0, -0x41
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x61
a=0;// 
a=0;//     if-lt p0, v0, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x7a
a=0;// 
a=0;//     if-gt p0, v0, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     add-int/lit8 v0, p0, -0x61
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1a
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     if-lt p0, v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x39
a=0;// 
a=0;//     if-gt p0, v0, :cond_2
a=0;// 
a=0;//     .line 70
a=0;//     add-int/lit8 v0, p0, -0x30
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1a
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1a
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unexpected code: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
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
a=0;//     .line 74
a=0;//     :sswitch_0
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);
a=0;//     const/16 v0, 0x3e
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 76
a=0;//     :sswitch_1
a=0;//     const/16 v0, 0x3f
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     :sswitch_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x2b -> :sswitch_0
a=0;//         0x2f -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private static decode(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;//     .locals 6
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;//     .param p1, "os"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x3d
a=0;// 
a=0;//     .line 108
a=0;//     #v5=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 113
a=0;//     .local v1, "len":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v3, v4, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 132
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 114
a=0;//     :cond_2
a=0;//     #v3=(Char);v4=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Base64;->decode(C)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     shl-int/lit8 v3, v3, 0x12
a=0;// 
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Base64;->decode(C)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v4, v4, 0xc
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     add-int/lit8 v4, v0, 0x2
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Base64;->decode(C)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v4, v4, 0x6
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     .line 120
a=0;//     add-int/lit8 v4, v0, 0x3
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Base64;->decode(C)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 119
a=0;//     #v4=(Integer);
a=0;//     add-int v2, v3, v4
a=0;// 
a=0;//     .line 122
a=0;//     .local v2, "tri":I
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v3, v2, 0x10
a=0;// 
a=0;//     #v3=(Short);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 123
a=0;//     add-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     if-eq v3, v5, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     shr-int/lit8 v3, v2, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 126
a=0;//     add-int/lit8 v3, v0, 0x3
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     if-eq v3, v5, :cond_1
a=0;// 
a=0;//     .line 128
a=0;//     and-int/lit16 v3, v2, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 130
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 112
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static decode(Ljava/lang/String;)[B
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "bos":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/Base64;->decode(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 99
a=0;//     .local v1, "decodedBytes":[B
a=0;//     :try_start_1
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 94
a=0;//     .end local v1    # "decodedBytes":[B
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v3}, Ljava/lang/RuntimeException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 101
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .restart local v1    # "decodedBytes":[B
a=0;//     :catch_1
a=0;//     #v1=(Reference,[B);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 102
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encode([B)Ljava/lang/String;
a=0;//     .locals 10
a=0;//     .param p0, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 23
a=0;//     .local v7, "start":I
a=0;//     #v7=(Null);
a=0;//     array-length v4, p0
a=0;// 
a=0;//     .line 24
a=0;//     .local v4, "len":I
a=0;//     #v4=(Integer);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v8, p0
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     mul-int/lit8 v8, v8, 0x3
a=0;// 
a=0;//     div-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     invoke-direct {v0, v8}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 26
a=0;//     .local v0, "buf":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     add-int/lit8 v2, v4, -0x3
a=0;// 
a=0;//     .line 27
a=0;//     .local v2, "end":I
a=0;//     #v2=(Integer);
a=0;//     move v3, v7
a=0;// 
a=0;//     .line 28
a=0;//     .local v3, "i":I
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "n":I
a=0;//     #v5=(Null);
a=0;//     move v6, v5
a=0;// 
a=0;//     .line 30
a=0;//     .end local v5    # "n":I
a=0;//     .local v6, "n":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v5=(Integer);v6=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-le v3, v2, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     add-int v8, v7, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v8, v8, -0x2
a=0;// 
a=0;//     if-ne v3, v8, :cond_3
a=0;// 
a=0;//     .line 47
a=0;//     aget-byte v8, p0, v3
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     and-int/lit16 v8, v8, 0xff
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     shl-int/lit8 v8, v8, 0x10
a=0;// 
a=0;//     add-int/lit8 v9, v3, 0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget-byte v9, p0, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     and-int/lit16 v9, v9, 0xff
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     shl-int/lit8 v9, v9, 0x8
a=0;// 
a=0;//     or-int v1, v8, v9
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "d":I
a=0;//     #v1=(Integer);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0x12
a=0;// 
a=0;//     #v9=(Short);
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0xc
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0x6
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 52
a=0;//     const-string v8, "="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 61
a=0;//     .end local v1    # "d":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 31
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     aget-byte v8, p0, v3
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     and-int/lit16 v8, v8, 0xff
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     shl-int/lit8 v8, v8, 0x10
a=0;// 
a=0;//     add-int/lit8 v9, v3, 0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget-byte v9, p0, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     and-int/lit16 v9, v9, 0xff
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     shl-int/lit8 v9, v9, 0x8
a=0;// 
a=0;//     or-int/2addr v8, v9
a=0;// 
a=0;//     add-int/lit8 v9, v3, 0x2
a=0;// 
a=0;//     aget-byte v9, p0, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     and-int/lit16 v9, v9, 0xff
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     or-int v1, v8, v9
a=0;// 
a=0;//     .line 33
a=0;//     .restart local v1    # "d":I
a=0;//     #v1=(Integer);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0x12
a=0;// 
a=0;//     #v9=(Short);
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 34
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0xc
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 35
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0x6
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 36
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     and-int/lit8 v9, v1, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 38
a=0;//     add-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     .line 40
a=0;//     add-int/lit8 v5, v6, 0x1
a=0;// 
a=0;//     .end local v6    # "n":I
a=0;//     .restart local v5    # "n":I
a=0;//     const/16 v8, 0xe
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-lt v6, v8, :cond_2
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v5=(Null);
a=0;//     const-string v8, " "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Integer);v8=(Conflicted);
a=0;//     move v6, v5
a=0;// 
a=0;//     .end local v5    # "n":I
a=0;//     .restart local v6    # "n":I
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 53
a=0;//     .end local v1    # "d":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v8=(Integer);v9=(Conflicted);
a=0;//     add-int v8, v7, v4
a=0;// 
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     if-ne v3, v8, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     aget-byte v8, p0, v3
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     and-int/lit16 v8, v8, 0xff
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     shl-int/lit8 v1, v8, 0x10
a=0;// 
a=0;//     .line 56
a=0;//     .restart local v1    # "d":I
a=0;//     #v1=(Integer);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0x12
a=0;// 
a=0;//     #v9=(Short);
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 57
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Base64;->legalChars:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     shr-int/lit8 v9, v1, 0xc
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x3f
a=0;// 
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 58
a=0;//     const-string v8, "=="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
