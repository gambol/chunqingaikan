package open189.sign; class ParamsSign { void a() { int a;
a=0;// .class public Lopen189/sign/ParamsSign;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ParamsSign.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static base64EncodeChars:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     .line 14
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x41s
a=0;//         0x42s
a=0;//         0x43s
a=0;//         0x44s
a=0;//         0x45s
a=0;//         0x46s
a=0;//         0x47s
a=0;//         0x48s
a=0;//         0x49s
a=0;//         0x4as
a=0;//         0x4bs
a=0;//         0x4cs
a=0;//         0x4ds
a=0;//         0x4es
a=0;//         0x4fs
a=0;//         0x50s
a=0;//         0x51s
a=0;//         0x52s
a=0;//         0x53s
a=0;//         0x54s
a=0;//         0x55s
a=0;//         0x56s
a=0;//         0x57s
a=0;//         0x58s
a=0;//         0x59s
a=0;//         0x5as
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//         0x67s
a=0;//         0x68s
a=0;//         0x69s
a=0;//         0x6as
a=0;//         0x6bs
a=0;//         0x6cs
a=0;//         0x6ds
a=0;//         0x6es
a=0;//         0x6fs
a=0;//         0x70s
a=0;//         0x71s
a=0;//         0x72s
a=0;//         0x73s
a=0;//         0x74s
a=0;//         0x75s
a=0;//         0x76s
a=0;//         0x77s
a=0;//         0x78s
a=0;//         0x79s
a=0;//         0x7as
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x2bs
a=0;//         0x2fs
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lopen189/sign/ParamsSign;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static base64Encode([B)Ljava/lang/String;
a=0;//     .locals 10
a=0;//     .param p0, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     new-instance v6, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .local v6, "sb":Ljava/lang/StringBuffer;
a=0;//     #v6=(Reference,Ljava/lang/StringBuffer;);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     .line 83
a=0;//     .local v5, "len":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     #v3=(Null);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 85
a=0;//     .end local v3    # "i":I
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 107
a=0;//     .end local v4    # "i":I
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_1
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 86
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v4    # "i":I
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "i":I
a=0;//     .restart local v3    # "i":I
a=0;//     aget-byte v7, p0, v4
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     and-int/lit16 v0, v7, 0xff
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "b1":I
a=0;//     #v0=(Integer);
a=0;//     if-ne v3, v5, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     ushr-int/lit8 v8, v0, 0x2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 89
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v0, 0x3
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x4
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v7, "=="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_1
a=0;//     #v7=(Byte);v8=(Conflicted);
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v4    # "i":I
a=0;//     aget-byte v7, p0, v3
a=0;// 
a=0;//     and-int/lit16 v1, v7, 0xff
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "b2":I
a=0;//     #v1=(Integer);
a=0;//     if-ne v4, v5, :cond_2
a=0;// 
a=0;//     .line 95
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     ushr-int/lit8 v8, v0, 0x2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 96
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v0, 0x3
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x4
a=0;// 
a=0;//     and-int/lit16 v9, v1, 0xf0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     ushr-int/lit8 v9, v9, 0x4
a=0;// 
a=0;//     or-int/2addr v8, v9
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 97
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v1, 0xf
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 98
a=0;//     const-string v7, "="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 99
a=0;//     .end local v4    # "i":I
a=0;//     .restart local v3    # "i":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 101
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v4    # "i":I
a=0;//     :cond_2
a=0;//     #v7=(Byte);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "i":I
a=0;//     .restart local v3    # "i":I
a=0;//     aget-byte v7, p0, v4
a=0;// 
a=0;//     and-int/lit16 v2, v7, 0xff
a=0;// 
a=0;//     .line 102
a=0;//     .local v2, "b3":I
a=0;//     #v2=(Integer);
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     ushr-int/lit8 v8, v0, 0x2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 103
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v0, 0x3
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x4
a=0;// 
a=0;//     and-int/lit16 v9, v1, 0xf0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     ushr-int/lit8 v9, v9, 0x4
a=0;// 
a=0;//     or-int/2addr v8, v9
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 104
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v1, 0xf
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     and-int/lit16 v9, v2, 0xc0
a=0;// 
a=0;//     ushr-int/lit8 v9, v9, 0x6
a=0;// 
a=0;//     or-int/2addr v8, v9
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 105
a=0;//     sget-object v7, Lopen189/sign/ParamsSign;->base64EncodeChars:[C
a=0;// 
a=0;//     #v7=(Reference,[C);
a=0;//     and-int/lit8 v8, v2, 0x3f
a=0;// 
a=0;//     aget-char v7, v7, v8
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v4    # "i":I
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static encryptBASE64([B)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "key"    # [B
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lopen189/sign/ParamsSign;->base64Encode([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static hmacSHA1Encrypt(Ljava/lang/String;Ljava/lang/String;)[B
a=0;//     .locals 7
a=0;//     .param p0, "encryptText"    # Ljava/lang/String;
a=0;//     .param p1, "encryptKey"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const-string v1, "HmacSHA1"
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "MAC_NAME":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     .line 43
a=0;//     .local v0, "ENCODING":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 44
a=0;//     .local v2, "data":[B
a=0;//     #v2=(Reference,[B);
a=0;//     new-instance v4, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v4=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     invoke-direct {v4, v2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     .local v4, "secretKey":Ljavax/crypto/SecretKey;
a=0;//     #v4=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     invoke-static {v1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 46
a=0;//     .local v3, "mac":Ljavax/crypto/Mac;
a=0;//     #v3=(Reference,Ljavax/crypto/Mac;);
a=0;//     invoke-virtual {v3, v4}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 48
a=0;//     .local v5, "text":[B
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-virtual {v3, v5}, Ljavax/crypto/Mac;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     return-object v6
a=0;// .end method
a=0;// 
a=0;// .method public static value(Ljava/util/TreeMap;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p1, "app_secret"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/TreeMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     .local p0, "params":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :try_start_0
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 25
a=0;//     .local v3, "signStr":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, p1}, Lopen189/sign/ParamsSign;->hmacSHA1Encrypt(Ljava/lang/String;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 29
a=0;//     .local v1, "hmacSHA1Bytes":[B
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1}, Lopen189/sign/ParamsSign;->encryptBASE64([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 32
a=0;//     .end local v1    # "hmacSHA1Bytes":[B
a=0;//     .end local v3    # "signStr":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 25
a=0;//     .restart local v3    # "signStr":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     .local v2, "pName":Ljava/lang/String;
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "&"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     .end local v2    # "pName":Ljava/lang/String;
a=0;//     .end local v3    # "signStr":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 31
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v4, "error"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
