package com.google.gson.internal; class Streams$AppendableWriter$CurrentWrite { void a() { int a;
a=0;// .class Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Streams.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/Streams$AppendableWriter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "CurrentWrite"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field chars:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public charAt(I)C
a=0;//     .locals 1
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;->chars:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     aget-char v0, v0, p1
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public length()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;->chars:[C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public subSequence(II)Ljava/lang/CharSequence;
a=0;//     .locals 3
a=0;//     .param p1, "start"    # I
a=0;//     .param p2, "end"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/Streams$AppendableWriter$CurrentWrite;->chars:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     sub-int v2, p2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, p1, v2}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
