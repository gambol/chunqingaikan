package com.google.gson.internal.bind; class TypeAdapters$23 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$23;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "TypeAdapters.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/TypeAdapters;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/util/Calendar;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DAY_OF_MONTH:Ljava/lang/String; = "dayOfMonth"
a=0;// 
a=0;// .field private static final HOUR_OF_DAY:Ljava/lang/String; = "hourOfDay"
a=0;// 
a=0;// .field private static final MINUTE:Ljava/lang/String; = "minute"
a=0;// 
a=0;// .field private static final MONTH:Ljava/lang/String; = "month"
a=0;// 
a=0;// .field private static final SECOND:Ljava/lang/String; = "second"
a=0;// 
a=0;// .field private static final YEAR:Ljava/lang/String; = "year"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$23;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$23;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Calendar;
a=0;//     .locals 10
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v9, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v9=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v0, v9, :cond_0
a=0;// 
a=0;//     .line 548
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 549
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 551
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V
a=0;// 
a=0;//     .line 552
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 553
a=0;//     .local v1, "year":I
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 554
a=0;//     .local v2, "month":I
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 555
a=0;//     .local v3, "dayOfMonth":I
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 556
a=0;//     .local v4, "hourOfDay":I
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 557
a=0;//     .local v5, "minute":I
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 558
a=0;//     .local v6, "second":I
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v9, Lcom/google/gson/stream/JsonToken;->END_OBJECT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     if-eq v0, v9, :cond_7
a=0;// 
a=0;//     .line 559
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 560
a=0;//     .local v7, "name":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextInt()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 561
a=0;//     .local v8, "value":I
a=0;//     #v8=(Integer);
a=0;//     const-string v0, "year"
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 562
a=0;//     move v1, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 563
a=0;//     :cond_2
a=0;//     const-string v0, "month"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 564
a=0;//     move v2, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 565
a=0;//     :cond_3
a=0;//     const-string v0, "dayOfMonth"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 566
a=0;//     move v3, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 567
a=0;//     :cond_4
a=0;//     const-string v0, "hourOfDay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 568
a=0;//     move v4, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 569
a=0;//     :cond_5
a=0;//     const-string v0, "minute"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 570
a=0;//     move v5, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 571
a=0;//     :cond_6
a=0;//     const-string v0, "second"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 572
a=0;//     move v6, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 575
a=0;//     .end local v7    # "name":Ljava/lang/String;
a=0;//     .end local v8    # "value":I
a=0;//     :cond_7
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonToken;);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V
a=0;// 
a=0;//     .line 576
a=0;//     new-instance v0, Ljava/util/GregorianCalendar;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/GregorianCalendar;);
a=0;//     invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/GregorianCalendar;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "x1"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     check-cast p2, Ljava/util/Calendar;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$23;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Calendar;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Calendar;)V
a=0;//     .locals 2
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/util/Calendar;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 599
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 585
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 586
a=0;//     const-string v0, "year"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 587
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 588
a=0;//     const-string v0, "month"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 589
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 590
a=0;//     const-string v0, "dayOfMonth"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 591
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 592
a=0;//     const-string v0, "hourOfDay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 593
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 594
a=0;//     const-string v0, "minute"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 595
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 596
a=0;//     const-string v0, "second"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 597
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 598
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
