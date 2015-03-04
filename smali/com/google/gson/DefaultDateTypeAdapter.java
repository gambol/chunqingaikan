package com.google.gson; class DefaultDateTypeAdapter { void a() { int a;
a=0;// .class final Lcom/google/gson/DefaultDateTypeAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DefaultDateTypeAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/JsonDeserializer;
a=0;// .implements Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/google/gson/JsonSerializer",
a=0;//         "<",
a=0;//         "Ljava/util/Date;",
a=0;//         ">;",
a=0;//         "Lcom/google/gson/JsonDeserializer",
a=0;//         "<",
a=0;//         "Ljava/util/Date;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final enUsFormat:Ljava/text/DateFormat;
a=0;// 
a=0;// .field private final iso8601Format:Ljava/text/DateFormat;
a=0;// 
a=0;// .field private final localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(PosByte);
a=0;//     sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {v1, v1, v0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "style"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {p1, v0}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 2
a=0;//     .param p1, "dateStyle"    # I
a=0;//     .param p2, "timeStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {p1, p2, v0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "datePattern"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-direct {v1, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
a=0;//     .locals 3
a=0;//     .param p1, "enUsFormat"    # Ljava/text/DateFormat;
a=0;//     .param p2, "localFormat"    # Ljava/text/DateFormat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     iput-object p1, p0, Lcom/google/gson/DefaultDateTypeAdapter;->enUsFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p2, p0, Lcom/google/gson/DefaultDateTypeAdapter;->localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     iput-object v0, p0, Lcom/google/gson/DefaultDateTypeAdapter;->iso8601Format:Ljava/text/DateFormat;
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/google/gson/DefaultDateTypeAdapter;->iso8601Format:Ljava/text/DateFormat;
a=0;// 
a=0;//     const-string v1, "UTC"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private deserializeToDate(Lcom/google/gson/JsonElement;)Ljava/util/Date;
a=0;//     .locals 4
a=0;//     .param p1, "json"    # Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget-object v2, p0, Lcom/google/gson/DefaultDateTypeAdapter;->localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/DateFormat;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/google/gson/DefaultDateTypeAdapter;->localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 98
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 101
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/text/ParseException;);
a=0;//     iget-object v1, p0, Lcom/google/gson/DefaultDateTypeAdapter;->enUsFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;//     :try_end_2
a=0;//     .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 102
a=0;//     :catch_1
a=0;//     #v0=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_4
a=0;//     iget-object v1, p0, Lcom/google/gson/DefaultDateTypeAdapter;->iso8601Format:Ljava/text/DateFormat;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;//     :try_end_4
a=0;//     .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_2
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_5
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :catch_2
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "e":Ljava/text/ParseException;
a=0;//     #v0=(Reference,Ljava/text/ParseException;);
a=0;//     new-instance v1, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v1
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Lcom/google/gson/JsonElement;
a=0;//     .param p2, "x1"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "x2"    # Lcom/google/gson/JsonDeserializationContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/google/gson/DefaultDateTypeAdapter;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/util/Date;
a=0;//     .locals 4
a=0;//     .param p1, "json"    # Lcom/google/gson/JsonElement;
a=0;//     .param p2, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "context"    # Lcom/google/gson/JsonDeserializationContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     instance-of v1, p1, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v1, Lcom/google/gson/JsonParseException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonParseException;);
a=0;//     const-string v2, "The date should be a string value"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/DefaultDateTypeAdapter;->deserializeToDate(Lcom/google/gson/JsonElement;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "date":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     const-class v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne p2, v1, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     .end local v0    # "date":Ljava/util/Date;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v0    # "date":Ljava/util/Date;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const-class v1, Ljava/sql/Timestamp;
a=0;// 
a=0;//     if-ne p2, v1, :cond_2
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v1, Ljava/sql/Timestamp;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/Timestamp;);
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/sql/Timestamp;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/Timestamp;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const-class v1, Ljava/sql/Date;
a=0;// 
a=0;//     if-ne p2, v1, :cond_3
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v1, Ljava/sql/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/Date;);
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/sql/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/Date;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " cannot deserialize to "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;//     .param p2, "x1"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "x2"    # Lcom/google/gson/JsonSerializationContext;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     check-cast p1, Ljava/util/Date;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/google/gson/DefaultDateTypeAdapter;->serialize(Ljava/util/Date;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public serialize(Ljava/util/Date;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
a=0;//     .locals 3
a=0;//     .param p1, "src"    # Ljava/util/Date;
a=0;//     .param p2, "typeOfSrc"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "context"    # Lcom/google/gson/JsonSerializationContext;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v2, p0, Lcom/google/gson/DefaultDateTypeAdapter;->localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/DateFormat;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/google/gson/DefaultDateTypeAdapter;->enUsFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "dateFormatAsString":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 74
a=0;//     .end local v0    # "dateFormatAsString":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-class v1, Lcom/google/gson/DefaultDateTypeAdapter;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 116
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/google/gson/DefaultDateTypeAdapter;->localFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x29
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
