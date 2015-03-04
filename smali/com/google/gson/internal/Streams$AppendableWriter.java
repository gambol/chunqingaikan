package com.google.gson.internal; class Streams$AppendableWriter { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/Streams$AppendableWriter;
a=0;// .super Ljava/io/Writer;
a=0;// .source "Streams.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/Streams;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "AppendableWriter"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final appendable:Ljava/lang/Appendable;
a=0;// 
a=0;// .field private final currentWrite:Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/Appendable;)V
a=0;//     .locals 1
a=0;//     .param p1, "appendable"    # Ljava/lang/Appendable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-direct {p0}, Ljava/io/Writer;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter;);
a=0;//     new-instance v0, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->currentWrite:Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->appendable:Ljava/lang/Appendable;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/Appendable;Lcom/google/gson/internal/Streams$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/Appendable;
a=0;//     .param p2, "x1"    # Lcom/google/gson/internal/Streams$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/Streams$AppendableWriter;-><init>(Ljava/lang/Appendable;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public flush()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(I)V
a=0;//     .locals 2
a=0;//     .param p1, "i"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->appendable:Ljava/lang/Appendable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Appendable;);
a=0;//     int-to-char v1, p1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write([CII)V
a=0;//     .locals 3
a=0;//     .param p1, "chars"    # [C
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->currentWrite:Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;);
a=0;//     iput-object p1, v0, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;->chars:[C
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->appendable:Ljava/lang/Appendable;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/Streams$AppendableWriter;->currentWrite:Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;);
a=0;//     add-int v2, p2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, p2, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
}}
