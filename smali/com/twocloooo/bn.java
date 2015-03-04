package com.twocloooo; class bn { void a() { int a;
a=0;// .class public Lcom/twocloooo/bn;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a([B)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v1, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v1, v0, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/zip/GZIPInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v5, v3, v6, v4}, Ljava/lang/String;-><init>([BII)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
