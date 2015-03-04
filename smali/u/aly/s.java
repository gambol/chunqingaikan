package u.aly; class s { void a() { int a;
a=0;// .class public Lu/aly/s;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ObjectSerializer.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lu/aly/s;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 27
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-static {p0}, Lu/aly/s;->b(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v2, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ObjectInputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 31
a=0;//     #v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/Serializable;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 23
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 15
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v1, Ljava/io/ObjectOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 17
a=0;//     #v1=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-virtual {v1, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 18
a=0;//     invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lu/aly/s;->a([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 20
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 23
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     shr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x61
a=0;// 
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 43
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x61
a=0;// 
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 41
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;)[B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     .line 51
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     return-object v1
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(Char);
a=0;//     div-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x61
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shl-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v3
a=0;// 
a=0;//     .line 54
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Char);
a=0;//     div-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     aget-byte v4, v1, v3
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     add-int/lit8 v2, v2, -0x61
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v3
a=0;// 
a=0;//     .line 51
a=0;//     add-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
