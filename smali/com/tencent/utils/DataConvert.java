package com.tencent.utils; class DataConvert { void a() { int a;
a=0;// .class public Lcom/tencent/utils/DataConvert;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 3
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/DataConvert;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static byteToInt2([B)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static bytesToInt([B)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 22
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static intToBytes(I)[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 12
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static intToBytes2(I)[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     .line 32
a=0;//     #v3=(PosByte);
a=0;//     new-array v1, v3, [B
a=0;// 
a=0;//     .line 33
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     mul-int/lit8 v2, v0, 0x8
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rsub-int/lit8 v2, v2, 0x18
a=0;// 
a=0;//     shr-int v2, p0, v2
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v0
a=0;// 
a=0;//     .line 33
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static putBytes2Bytes([BI[BI)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-ge v0, p1, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     add-int v1, p3, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, p2, v1
a=0;// 
a=0;//     .line 136
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static putBytes2Bytes([B[BI)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     add-int v1, p2, v0
a=0;// 
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, p1, v1
a=0;// 
a=0;//     .line 129
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static putInt2Bytes(I[BI)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-static {p0}, Lcom/tencent/utils/DataConvert;->intToBytes2(I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     add-int v2, p2, v0
a=0;// 
a=0;//     aget-byte v3, v1, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, p1, v2
a=0;// 
a=0;//     .line 107
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static putShort2Bytes(I[BI)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 114
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {p0}, Lcom/tencent/utils/DataConvert;->intToBytes2(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 115
a=0;//     #v0=(Reference,[B);
a=0;//     add-int/lit8 v1, p2, 0x0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v2, v0, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, p1, v1
a=0;// 
a=0;//     .line 116
a=0;//     add-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-byte v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     aput-byte v0, p1, v1
a=0;// 
a=0;//     .line 117
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public static putString2Bytes(Ljava/lang/String;[BI)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-static {p0}, Lcom/tencent/utils/DataConvert;->string2bytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     add-int v2, p2, v0
a=0;// 
a=0;//     aget-byte v3, v1, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, p1, v2
a=0;// 
a=0;//     .line 122
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static string2ascii(Ljava/lang/String;)[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 97
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [B
a=0;// 
a=0;//     .line 98
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 98
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static string2bytes(Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 77
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v0, v2, 0x2
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Integer);
a=0;//     rem-int/lit8 v3, v2, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 81
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-array v3, v0, [B
a=0;// 
a=0;//     .line 84
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     mul-int/lit8 v4, v2, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/lit8 v5, v2, 0x2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v3, v2
a=0;// 
a=0;//     .line 84
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString([B)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 59
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     aget-byte v1, p0, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v1, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 59
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 66
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
