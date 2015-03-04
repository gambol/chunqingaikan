package com.google.gson.internal; class LazilyParsedNumber { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/LazilyParsedNumber;
a=0;// .super Ljava/lang/Number;
a=0;// .source "LazilyParsedNumber.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final value:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Number;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LazilyParsedNumber;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private writeReplace()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/ObjectStreamException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     new-instance v0, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/math/BigDecimal;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doubleValue()D
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public floatValue()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public intValue()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 37
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 41
a=0;//     .local v1, "nfe":Ljava/lang/NumberFormatException;
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v2, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/math/BigDecimal;);
a=0;//     invoke-virtual {v2}, Ljava/math/BigDecimal;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public longValue()J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 50
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 51
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v1, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/math/BigDecimal;);
a=0;//     invoke-virtual {v1}, Ljava/math/BigDecimal;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LazilyParsedNumber;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
