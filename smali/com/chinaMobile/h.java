package com.chinaMobile; class h { void a() { int a;
a=0;// .class public final Lcom/chinaMobile/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final b:[C
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/io/PrintStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     return-void
a=0;// 
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
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/chinaMobile/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;[B)I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     :cond_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p1, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x39
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v1, v4, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v0, Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/PrintStream;);
a=0;//     invoke-direct {v0, p2}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     iput-object v0, p0, Lcom/chinaMobile/h;->a:Ljava/io/PrintStream;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p1, v1}, Lcom/chinaMobile/h;->a(Ljava/io/InputStream;[B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     if-lt v2, v4, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/h;->a:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/PrintStream;->println()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v3, v0, 0x3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gt v3, v2, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {p2, v1, v0, v3}, Lcom/chinaMobile/h;->a(Ljava/io/OutputStream;[BII)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     sub-int v3, v2, v0
a=0;// 
a=0;//     invoke-static {p2, v1, v0, v3}, Lcom/chinaMobile/h;->a(Ljava/io/OutputStream;[BII)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/OutputStream;[BII)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p3, v0, :cond_0
a=0;// 
a=0;//     aget-byte v0, p1, p2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sget-object v1, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     ushr-int/lit8 v2, v0, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x3f
a=0;// 
a=0;//     aget-char v1, v1, v2
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v1, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     shl-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     aget-char v0, v1, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(PosByte);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p3, v0, :cond_1
a=0;// 
a=0;//     aget-byte v0, p1, p2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     ushr-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x3f
a=0;// 
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v2, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     shl-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     ushr-int/lit8 v3, v1, 0x4
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0xf
a=0;// 
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     aget-char v0, v2, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     shl-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x3c
a=0;// 
a=0;//     aget-char v0, v0, v1
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     aget-byte v0, p1, p2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     add-int/lit8 v2, p2, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     sget-object v3, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     ushr-int/lit8 v4, v0, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x3f
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v3}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v3, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     shl-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     ushr-int/lit8 v4, v1, 0x4
a=0;// 
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     aget-char v0, v3, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     shl-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x3c
a=0;// 
a=0;//     ushr-int/lit8 v3, v2, 0x6
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     aget-char v0, v0, v1
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/chinaMobile/h;->b:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     and-int/lit8 v1, v2, 0x3f
a=0;// 
a=0;//     aget-char v0, v0, v1
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a([B)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/chinaMobile/h;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     const-string v1, "8859_1"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Error;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Error;);
a=0;//     const-string v1, "CharacterEncoder.encode internal error"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Error;);
a=0;//     throw v0
a=0;// .end method
}}
